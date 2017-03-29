/**
 * Created by USER on 18.02.2017.
 */
public class Loader {
    public static void main(String[] args) {
        ThreadExample thread =new ThreadExample();
        thread.start();
        RunnableExample thread2= new RunnableExample();
        Thread thread1= new Thread(thread2);
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
