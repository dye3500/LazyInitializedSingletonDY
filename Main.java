public class Main {

    public static void main(String args[]) {
        /*ThreadMaker one = new ThreadMaker("One");
        ThreadMaker two = new ThreadMaker("Two");

        one.start();
        two.start();*/

        ThreadMaker[] tm= new ThreadMaker[30];

        for (int i = 0; i < tm.length; i++) {
            tm[i] = new ThreadMaker(String.format("Thread-%d",i));
        }

        for (int i = 0; i < tm.length; i++) {
            tm[i].start();
        }
    }



}