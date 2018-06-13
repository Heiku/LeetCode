import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*String s = new String("heiku.github.io");
        String []arr = s.split("\\.");1
        for (String str : arr){
            System.out.println(str);
        }*/

        /*System.out.println((701-25) % 26);*/

        /*long i = 36526445/ 62;
        long j = i * 62;
        long k = 36526445 - j;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);*/

        try {
            Class c = Class.forName("Easy.IsPalindrome");
            Method method = c.getDeclaredMethod("isPalindrome");
            method.invoke(new Integer(121));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }



    }



}
