import javax.sound.midi.Soundbank;

public class MyCounter {
    private int taeller;
    private String name;

    public MyCounter(String name) {
        this.name=name;
        this.taeller=0;
    }

    public synchronized void taelOp() {
        /*
        try {
            Thread.sleep((int) (Math.random() * 10));
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

         */
        this.taeller = this.taeller + 1;
    }

    public int getSum() {
        return this.taeller;
    }

}
