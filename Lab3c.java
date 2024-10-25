abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDoseTaken = false;

    // Constructor to initialize age and nationality
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for the first dose
    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose successful! Please pay 250rs.");
            firstDoseTaken = true;
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Concrete method for the second dose
    public void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Second dose successful!");
        } else {
            System.out.println("You need to take the first dose before the second dose.");
        }
    }

    // Abstract method for booster dose
    public abstract void boosterDose();
}

// Implementation class for vaccine
class VaccinationSuccessful extends Vaccine {

    // Constructor to initialize age and nationality
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Implementing the abstract method boosterDose
    @Override
    public void boosterDose() {
        if (firstDoseTaken) {
            System.out.println("Booster dose successful!");
        } else {
            System.out.println("You need to complete the first and second doses before taking the booster dose.");
        }
    }
}

// Main class to run the program
public class Vaccination {
    public static void main(String[] args) {
        // Create an instance of VaccinationSuccessful with age and nationality
        VaccinationSuccessful user1 = new VaccinationSuccessful(25, "Indian");

        // Invoke methods for the vaccination process
        user1.firstDose();     // Scenario 1
        user1.secondDose();    // Scenario 2
        user1.boosterDose();   // Scenario 3
    }
}

