package thread.day_2025_07_01.start;

public class HelloRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : run()");
    }
}
