class NumberPrinter extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Adding a short delay to see the output more clearly
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberPrinter thread = new NumberPrinter();
        thread.start();
    }
}
