package nothing;

import java.util.concurrent.*;

/**
 * Created by Heiku on 2018/9/13
 */
public class CallableTest {

    public static void main(String[] args) throws Exception{

        FutureTask task = new FutureTask(new MyCallable());

        /*Thread thread = new Thread(task);
        thread.start();*/

        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(task);

        System.out.println(task.get());
    }
}

class MyCallable implements Callable{

    @Override
    public Object call() {
        int count = 0;
        for (int i = 1; i <= 100; i++){
            count += i;
        }
        return count;
    }
}
