package interview;


/**
 *题目：交替打印奇偶数，利用多线程
 *
 * 思路：利用消息等待机制，判断flag，运行不同的线程
 *      注意锁住同一个类变量，控制两个线程
 */
public class PrintOddEven {
    private int start = 1;

    private boolean flag = false;

    public static void main(String[] args) {

        PrintOddEven printOddEven = new PrintOddEven();

        Thread t1 = new Thread(new Odd(printOddEven));
        t1.setName("Thread A");

        Thread t2 = new Thread(new Even(printOddEven));
        t2.setName("Thread B");

        t1.start();
        t2.start();
    }


    public static class Odd implements Runnable{

        private PrintOddEven number;

        public Odd(PrintOddEven number){
            this.number = number;
        }

        @Override
        public void run() {
            while (number.start <= 100){
                synchronized (PrintOddEven.class){
                    //System.out.println("奇数线程抢到了锁");

                    if (!number.flag){          // 根据flag，运行不同线程
                        System.out.println(Thread.currentThread().getName() + " 奇数 " + number.start);
                        number.start++;

                        number.flag = true;

                        PrintOddEven.class.notify();
                    }else {
                        try {
                            PrintOddEven.class.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }


    public static class Even implements Runnable{

        private PrintOddEven number;

        public Even(PrintOddEven number){
            this.number = number;
        }

        @Override
        public void run() {
            while (number.start <= 100){
                synchronized (PrintOddEven.class){
                    //System.out.println("偶数线程抢到了锁");

                    if (number.flag){               // 根据flag，运行不同线程
                        System.out.println(Thread.currentThread().getName() + " 偶数 " + number.start);
                        number.start++;

                        number.flag = false;

                        PrintOddEven.class.notify();
                    }else {
                        try {
                            PrintOddEven.class.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

