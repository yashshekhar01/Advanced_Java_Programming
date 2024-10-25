// Superclass
class HillStations {
    // Overridden in subclasses
    public void location() {
        System.out.println("This is a hill station.");
    }

    // Overridden in subclasses
    public void famousFor() {
        System.out.println("Hill station famous for tourism.");
    }
}

// Subclass Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for snow-capped mountains and adventure sports.");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for scenic beauty and waterfalls.");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for skiing and beautiful landscapes.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of subclasses
        HillStations hill1 = new Manali();
        HillStations hill2 = new Mussoorie();
        HillStations hill3 = new Gulmarg();

        // Calling overridden methods using superclass reference
        System.out.println("Calling methods using the HillStations reference (Parent class reference):");
        hill1.location();
        hill1.famousFor();

        hill2.location();
        hill2.famousFor();

        hill3.location();
        hill3.famousFor();

        // Calling methods using subclass objects directly
        System.out.println("\nCalling methods using the subclass objects:");
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();

        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
    }
}
