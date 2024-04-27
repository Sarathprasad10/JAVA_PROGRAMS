import java.util.*;

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print("Odd Thread: " + i+"\t");
        }
    }
}

class EvenThread extends Thread 
{
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print("Even Thread: " + i+("\t"));
        }
    }
}

public class ThreadOddEven  
{
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread: All threads have terminated.");
    }
}
