public class Main {

    public static void main(String[] args) throws InterruptedException {

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<23;i++) {
                    System.out.println("I'm counting "+i+" " + Thread.currentThread().getName() );
                }
            }
        };

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    System.out.println("Number .."+i+" "+Thread.currentThread().getName());
                }

            }
        };
        Thread t = new Thread(r);
        t.setName("Kurt");
        Thread t2 = new Thread(r2);
        t2.setName("Verner");
        
        t.start();
        t2.start();
        t.join();
        t2.join();
        /*
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
         */
        t.join();
        System.out.println("Done");
	// write your code here
    }
}
