package thread.control.thread.day_2025_07_03;

import static utils.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new myRunnable(), "myThread");

        log("myThread.state1 = " + thread.getState());
        log("myThread.start()");
        thread.start();
        Thread.sleep(1000);
        log("myThread.state3" + thread.getState()); //TIME_WAITING
        Thread.sleep(4000);
        log("myThread.state5 = " + thread.getState()); //TERMINATED
    }

    static class myRunnable implements Runnable {

        @Override
        public void run() {

            try {
                log("start");
                Thread thread = Thread.currentThread();
                log("myThread.state2 = " + Thread.currentThread().getState()); //RUNNABLE
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log("myThread.state2 = " + Thread.currentThread().getState()); //RUNNABLE

                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
