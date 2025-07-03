package thread.mission.day_2025_07_01;

import static utils.MyLogger.log;

public class MissionOne {
    public static void main(String[] args) {
        log("main start");
        CounterThread counterThread = new CounterThread();
        counterThread.start();
        log("main end");
    }

    static class CounterThread extends Thread {

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
