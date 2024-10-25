// Custom exceptions
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

// TaxCalculator class
class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        // Check if the employee is not an Indian
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        // Check if the employee name is null or empty
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }

        // Calculate tax based on salary
        double taxAmount = 0.0;

        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }

        return taxAmount;
    }
}

// Main class
public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        // Test cases
        try {
            // Test Case 1
            System.out.println("Test Case 1:");
            double tax = calculator.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test Case 2
            System.out.println("Test Case 2:");
            double tax = calculator.calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test Case 3
            System.out.println("Test Case 3:");
            double tax = calculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test Case 4
            System.out.println("Test Case 4:");
            double tax = calculator.calculateTax("", true, 30000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
