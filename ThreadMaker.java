public class ThreadMaker implements Runnable{
    private Thread t;

    private String threadName;

    LazyInitializedSingleton instanceOne;

    ThreadMaker (String name) {
        threadName = name;
        //System.out.println("Creating " + threadName);
    }

    public void run() {
        // System.out.println("Running " + threadName);
        System.out.println(instanceOne.getInstance().hashCode());
    }

    public void start () {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread ( this, threadName);
            t.start();
        }
    }


}
