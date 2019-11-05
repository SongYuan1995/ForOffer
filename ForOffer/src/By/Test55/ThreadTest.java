package By.Test55;

/**
 * @Author: SongYuan
 * @Date: 2019/10/18 14:30
 * @Description: 设计 4 个线程，其中两个线程每次对 j增加 1，另外两个线程对 j每次减少
 */
public class ThreadTest {
    private int j;


    private void increment() {
        j += 1;
    }

    private synchronized void decend() {
        j -= 1;
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Inc inc = threadTest.new Inc();
        Dec dec = threadTest.new Dec();
        for (int i = 0; i < 2; i++) {
            Thread thread1 = new Thread(inc,"线程加");
            thread1.start();
            thread1 = new Thread(dec,"线程减");
            thread1.start();
        }


    }
    class Inc implements Runnable{


        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                increment();
                System.out.println(Thread.currentThread().getName()+":"+j);
            }
        }


    }
    class Dec implements Runnable{


        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                decend();
                System.out.println(Thread.currentThread().getName()+":"+j);
            }
        }


    }
}




