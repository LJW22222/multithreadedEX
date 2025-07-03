package thread.mission.day_2025_07_01;

import static utils.MyLogger.log;

public class MissionFour {

    public static void main(String[] args) {

        Thread threadA = new Thread(new CounterRunnable(1000, "A"), "Thread-A");
        Thread threadB = new Thread(new CounterRunnable(500, "B"), "Thread-B");
        threadA.start();
        threadB.start();
    }

    static class CounterRunnable implements Runnable {
        private final int mileSecond;
        private final String name;
        public CounterRunnable(int mileSecond, String name) {
            this.mileSecond = mileSecond;
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    log(name);
                    Thread.sleep(mileSecond);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
