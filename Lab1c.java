public class CheckNthBit {

    public static void main(String[] args) {
        // Declare and initialize a variable 'num' with a given number
        int num = 29; // Example: binary of 29 is 11101
        
        // Declare and initialize the variable 'n' with the bit position
        int n = 3; // We want to check the 3rd bit (starting from 0)
        
        // Left shift 1 by 'n' positions and perform bitwise AND with 'num'
        // This will isolate the nth bit and check if it's 1 or 0
        int mask = 1 << n; // Creates a mask by shifting 1 by 'n' positions
        
        // Perform bitwise AND between 'num' and 'mask'
        boolean isSet = (num & mask) != 0;
        
        // Check if the nth bit is set and print the result
        if (isSet) {
            System.out.println("The " + n + "th bit of number " + num + " is set (1).");
        } else {
            System.out.println("The " + n + "th bit of number " + num + " is not set (0).");
        }
    }
}
