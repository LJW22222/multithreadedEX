package thread.day_2025_07_01.start;

import static utils.MyLogger.log;

public class InnerRunnableMainV4 {

    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(() -> log("run()"));
        thread.start();
        log("main() emd");
    }

}
