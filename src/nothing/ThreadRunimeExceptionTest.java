package nothing;

/**
 * Created by Heiku on 2018/9/10
 *
 * throw RunTimeException 直接出局，向下执行（除了finally外）
 */
public class ThreadRunimeExceptionTest {
    public static void main(String[] args) {



        try {
            int j = 100 / 0;

            System.out.println("try");
        }catch (Exception e){
            System.out.println("catch");
            throw new RuntimeException();
        }finally {
            System.out.println("final");
        }

        System.out.println("out");
    }
}

class Job extends Thread{
    @Override
    public void run() {
        System.out.println("abc");
    }
}
