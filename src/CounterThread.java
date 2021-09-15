public class CounterThread extends Thread{
    MyCounter myCounter;

    public CounterThread(MyCounter myCounter) {
        this.myCounter =  myCounter;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            myCounter.taelOp();
        }
    }
}
