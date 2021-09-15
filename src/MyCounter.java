public class MyCounter {
    private int taeller;
    private String name;

    public MyCounter(String name) {
        this.name=name;
        this.taeller=0;
    }

    public void taelOp(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        this.taeller=this.taeller + 1;
    }

    public int getSum() {
        return this.taeller;
    }

}
