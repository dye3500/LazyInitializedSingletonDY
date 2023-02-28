public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;


    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
}
public void run() {
        System.out.println("From run() method:" +  Thread.currentThread().getName());
}