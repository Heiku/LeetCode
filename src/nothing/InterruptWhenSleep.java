package nothing;

/**
 * Created by Heiku on 2018/9/20
 */
public class InterruptWhenSleep {

    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}


class MyThread extends Thread{

    @Override
    public void run() {
        try{
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");

        }catch (InterruptedException e){

            System.out.println("在沉睡中被停止！进入catch！"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
