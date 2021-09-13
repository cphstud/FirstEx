import javax.management.timer.Timer;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter("Kurts tæller");
        CounterThread t1 = new CounterThread(myCounter);
        CounterThread t2 = new CounterThread(myCounter);
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long stop = System.currentTimeMillis();
        System.out.println("It took " + ((stop-start)) + " " +myCounter.getSum());

        System.out.println("Done");
	// write your code here
    }
}
