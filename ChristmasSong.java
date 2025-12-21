import java.util.Random;

public class TwelveDaysOfChristmas {

    public static void main(String[] args) {

        for (int day = 1; day <= 12; day++) {
            printDayIntro(day);
            printGifts(day);
            System.out.println(); // blank line between days
        }
    }

    // 1. Prints the first line
    static void printDayIntro(int day) {
        System.out.println(
            "On the " + getDayName(day) +
            " day of Christmas, my true love sent to me:"
        );
    }

    // 2. Returns day name
    static String getDayName(int day) {
        return switch (day) {
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            case 4 -> "fourth";
            case 5 -> "fifth";
            case 6 -> "sixth";
            case 7 -> "seventh";
            case 8 -> "eighth";
            case 9 -> "ninth";
            case 10 -> "tenth";
            case 11 -> "eleventh";
            case 12 -> "twelfth";
            default -> "";
        };
    }

    // 3. Prints gifts
    static void printGifts(int day) {
        switch (day) {
            case 12 -> System.out.println("Twelve drummers drumming");
            case 11 -> System.out.println("Eleven pipers piping");
            case 10 -> System.out.println("Ten lords a-leaping");
            case 9  -> System.out.println("Nine ladies dancing");
            case 8  -> System.out.println("Eight maids a-milking");
            case 7  -> System.out.println("Seven swans a-swimming");
            case 6  -> System.out.println("Six geese a-laying");
            case 5  -> System.out.println("Five golden rings");
            case 4  -> System.out.println("Four calling birds");
            case 3  -> System.out.println("Three French hens");
            case 2  -> System.out.println("Two turtle doves");
            case 1  -> System.out.println(
                day == 1
                    ? "A partridge in a pear tree"
                    : "And a partridge in a pear tree"
            );
        }
    }
}

