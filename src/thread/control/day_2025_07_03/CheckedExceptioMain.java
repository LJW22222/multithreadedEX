package thread.control.day_2025_07_03;

public class CheckedExceptioMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() /* throws Exception */{ //  주석 풀면 에러 발생
            //주석 풀면 에러 발생
//            throw new Exception()
        }
    }
}
