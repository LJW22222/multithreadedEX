package thread.control.thread.day_2025_07_03;

import thread.day_2025_07_01.start.HelloThread;

import static utils.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {
        //main Thread
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId = " + mainThread.threadId());
        log("mainThread.getName = " + mainThread.getName());
        log("mainThread.getThraedPriority() = " + mainThread.getPriority());
        log("mainThread.getThreadGroup = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());



        Thread myThread = new Thread(new HelloThread(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId = " + myThread.threadId());
        log("myThread.getName = " + myThread.getName());
        log("myThread.getThraedPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());


    }
}
