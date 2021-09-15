import javax.management.timer.Timer;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter("Kurts tæller");
        CounterThread t1 = new CounterThread(myCounter);
        CounterThread t2 = new CounterThread(myCounter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Done");
	// write your code here
    }
}
