import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Cat barsik = new Cat("Barsik");
      Dog rex = new Dog("Rex");
      Dog sharik = new Dog("Sharik");

      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter the distances for the cat to run:");
      barsik.run(scanner.nextInt(), barsik.getCatName());
      System.out.println("Please enter the distances for the cat to swim:");
      barsik.swim(scanner.nextInt(), barsik.getCatName());

      System.out.println("Please enter the distances for the dogs to run:");
      rex.run(scanner.nextInt(), rex.getDogName());
      sharik.run(scanner.nextInt(), sharik.getDogName());
      System.out.println("Please enter the distances for the dogs to swim:");
      rex.swim(scanner.nextInt(), rex.getDogName());
      sharik.swim(scanner.nextInt(), sharik.getDogName());

      System.out.println("Amount of animals made: "+Animal.numberOfAnimals);
      System.out.println("Amount of cats made: "+Cat.numberOfCats);
      System.out.println("Amount of dogs made: "+Dog.numberOfDogs);
    }
}
class Animal {
    public static int numberOfAnimals=0;
    public Animal(){
        numberOfAnimals++;
    }
    public void run(int length) {
        System.out.println("run");
    }
    public void swim(int length) {
        System.out.println("swim");
    }
}
class Cat extends Animal{
    private String catName;
    public static int numberOfCats=0;
    public Cat(String catName) {
        this.catName = catName;
        numberOfCats++;
    }
    public void run(int lengthRan, String catName) {
        int maxRunLength=200;
        if (lengthRan<=maxRunLength){
        System.out.println("Cat "+catName+" ran "+lengthRan+ " m");}
        else {
            System.err.println(catName+" can't run more than 200 m!");
        }
    }
    public void swim(int length, String catName) {
        System.err.println(catName+" can't swim!");
    }
    public String getCatName() {
        return catName;
    }
    public void setCatName(String catName) {
        this.catName = catName;
    }
}
class Dog extends Animal{
    private String dogName;
    public static int numberOfDogs=0;
    public Dog(String dogName) {
        this.dogName = dogName;
        numberOfDogs++;
    }
    public void run(int lengthRan, String dogName) {
        int maxRunLength=500;
        if (lengthRan<=maxRunLength){
            System.out.println("Dog "+dogName+" ran "+lengthRan+ " m");}
        else {
            System.err.println(dogName+" can't run more than "+maxRunLength+" m!");
        }
    }
    public void swim(int lengthSwam, String dogName) {
        int maxSwimLength=10;
        if (lengthSwam<=maxSwimLength){
            System.out.println("Dog "+dogName+" swam "+lengthSwam+ "m");}
        else {
            System.err.println(dogName+" can't swim more than "+maxSwimLength+" m!");
        }
    }
    public String getDogName() {
        return dogName;
    }
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
}
