public class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
    this.name = name;
    this.breed = breed;    
    }
    
    public void setName(String name){
    this.name = name;
    }
    
    public void setBreed(String breed){
    this.breed = breed;
    }
    
    public String getName(){
    return name;
    }
        
    public String getBreed(){
    return breed;    
    }
}

public class Demo3{
    public static void main(String[]args){
    Dog pet = new Dog("Jagur", "Ausacian");
    
    Dog pet2 = new Dog("Bingo", "Eskimo");

    System.out.println(pet.getName() + " is " + pet.getBreed());
    System.out.println(pet2.getName() + " is " + pet2.getBreed());

    pet.setName("Rabber");
    pet.setBreed("Asin");
    pet2.setBreed("Agba");

    System.out.println(pet.getName() + " is " + pet.getBreed());
    System.out.println(pet2.getName() + " is " + pet2.getBreed());

    }
    

}
