// Define a class that extends Thread
class NumberPrinter extends Thread {
    // Override the run() method to define the thread's behavior
    public void run() {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // Print the current number
            
            try {
                // Make the thread sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle the exception if the thread is interrupted
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of NumberPrinter
        NumberPrinter thread = new NumberPrinter();
        
        // Start the thread, which calls the run() method
        thread.start();
    }
}
