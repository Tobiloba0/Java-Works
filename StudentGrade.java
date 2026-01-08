import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentGrade {

    // ================= VALIDATION =================
    public static int parsePositiveInt(String input) {
        int value = Integer.parseInt(input);
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be greater than zero.");
        }
        return value;
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int students = 0;
        int subjectsCount = 0;

        // ---- STUDENTS ----
        while (true) {
            try {
                System.out.print("How many students do you have?: ");
                students = parsePositiveInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // ---- SUBJECTS ----
        while (true) {
            try {
                System.out.print("How many subjects do they offer?: ");
                subjectsCount = parsePositiveInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        ArrayList<String> subjects = new ArrayList<>();
        int[][] scores = new int[students][subjectsCount];
        int[] totals = new int[students];
        double[] averages = new double[students];
        int[] positions = new int[students];

        // ---- SUBJECT NAMES ----
        for (int i = 0; i < subjectsCount; i++) {
            System.out.print("Enter name of subject " + (i + 1) + ": ");
            subjects.add(input.nextLine());
        }

        // ---- SCORES ----
        for (int s = 0; s < students; s++) {
            System.out.println("\nEntering scores for Student " + (s + 1));
            for (int sub = 0; sub < subjectsCount; sub++) {
                while (true) {
                    try {
                        System.out.print(subjects.get(sub) + ": ");
                        int score = Integer.parseInt(input.nextLine());
                        if (score < 0 || score > 100)
                            throw new IllegalArgumentException("Score must be 0–100");
                        scores[s][sub] = score;
                        totals[s] += score;
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            averages[s] = (double) totals[s] / subjectsCount;
        }

        // ================= POSITIONS =================
        Integer[] index = new Integer[students];
        for (int i = 0; i < students; i++) index[i] = i;

        Arrays.sort(index, (a, b) -> totals[b] - totals[a]);

        for (int i = 0; i < students; i++) {
            positions[index[i]] = i + 1;
        }

        // ================= TABLE OUTPUT =================
        System.out.println("\n==============================================================");
        System.out.printf("%-10s", "STUDENT");

        for (int i = 0; i < subjectsCount; i++) {
            System.out.printf("SUB%-3d", i + 1);
        }

        System.out.printf("%6s%7s%6s\n", "TOT", "AVE", "POS");
        System.out.println("==============================================================");

        for (int s = 0; s < students; s++) {
            System.out.printf("%-10s", "Student " + (s + 1));
            for (int sub = 0; sub < subjectsCount; sub++) {
                System.out.printf("%-6d", scores[s][sub]);
            }
            System.out.printf("%-6d%-7.2f%-6d\n",
                    totals[s], averages[s], positions[s]);
        }

        // ================= CLASS SUMMARY =================
        int classTotal = 0;
        for (int t : totals) classTotal += t;
        double classAverage = (double) classTotal / students;

        System.out.println("\n==============================================================");
        System.out.println("CLASS SUMMARY");
        System.out.println("==============================================================");

        int best = index[0];
        int worst = index[students - 1];

        System.out.println("Best Graduating Student: Student " + (best + 1)
                + " scoring " + totals[best]);

        System.out.println("Worst Graduating Student: Student " + (worst + 1)
                + " scoring " + totals[worst]);

        System.out.println("Class Total Score: " + classTotal);
        System.out.println("Class Average Score: " + classAverage);
        System.out.println("==============================================================");

    }
}

