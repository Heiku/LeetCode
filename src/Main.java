import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String s = new String("heiku.github.io");
        String []arr = s.split("\\.");
        for (String str : arr){
            System.out.println(str);
        }
    }
}
