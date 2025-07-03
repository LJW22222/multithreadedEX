package thread.day_2025_07_01.start;

public class BadThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전");
        //Thread를 실행시키려면 start()메서드를 써야 함.
        //직접 run() 호출하면 main Thread가 호출하게 되버림.
        //결론적으로 main()이 사용하는 Stack에 run()메서드가 적재 되어 버림.
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");

        System.out.println(Thread.currentThread().getName() + " : main() end");

    }
}
