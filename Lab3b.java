// Superclass Animal
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to demonstrate method overriding
public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling makeSound() method for each object
        myDog.makeSound();  // Outputs: The dog barks.
        myCat.makeSound();  // Outputs: The cat meows.
    }
}

