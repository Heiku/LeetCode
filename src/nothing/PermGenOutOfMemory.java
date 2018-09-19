package nothing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heiku on 2018/9/17
 *
 * intern()模拟方法区 Out Of Memory
 *
 * intern（）指的是，如果常量去存在该字符串，则直接引用，否则将该string放入常量池中
 */
public class PermGenOutOfMemory {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
