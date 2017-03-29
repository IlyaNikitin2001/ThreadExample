/**
 * Created by USER on 18.02.2017.
 */
public class RunnableExample implements Runnable {


    @Override
    public void run() {
    for (int i=10; i>0; i--){
        System.out.println(Thread.currentThread().getName()+" "+i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }
}
