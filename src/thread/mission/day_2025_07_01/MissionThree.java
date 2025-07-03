package thread.mission.day_2025_07_01;

import static utils.MyLogger.log;

public class MissionThree {
    public static void main(String[] args) {

        log("main start");
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                log("value : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "counter");
        thread.start();
        log("main end");
    }

}
