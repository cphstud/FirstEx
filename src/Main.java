import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // opret den fælles ressource
        MyCounter mc = new MyCounter("Kurt");
        // opret to tråde som deler denne ressource
        CounterThread t1 = new CounterThread(mc);
        CounterThread t2 = new CounterThread(mc);
        // start de to tråde.
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println(mc.getSum());


	// write your code here
    }
}
