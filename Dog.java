
public class Dog {

    public static void main(String[] args) {
        Dog myDog = new Dog("Corgi", "Alexis", 5, 3.6);
        myDog.bark();

    }

// Declares that all dogs must have breed, name, age and weight
    private String breed;
    private String name;
    private int age;
    private double weight;

    // constrcutor 
    public Dog(String breed, String name, int age, double weight) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    //Behaviours meaning method
    public void bark() {
        System.out.println("WOOF WOOF! " + "says " + name);

    }

    public int getAge() {
        return age;
    }

}
