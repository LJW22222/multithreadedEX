package thread.day_2025_07_01.start;

public class HelloThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : run()");
    }

}
