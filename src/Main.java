import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*String s = new String("heiku.github.io");
        String []arr = s.split("\\.");
        for (String str : arr){
            System.out.println(str);
        }*/

        /*System.out.println((701-25) % 26);*/
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.remove(3);
        System.out.println(list.get(2));
    }
}
