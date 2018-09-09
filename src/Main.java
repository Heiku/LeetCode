import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {



    public static void main(String[] args){

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

        /*try {
            Class c = Class.forName("Something.IsPalindrome");
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
        }*/


        /*PriorityQueue<Integer> queue = new PriorityQueue<>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        int []arr = new int[]{3,5,2,4,7};
        for (int i = 0; i < arr.length; i++){
            queue.offer(arr[i]);
        }

        while (!queue.isEmpty()){
            System.out.print(queue.poll());
        }*/
        /*try {
            System.out.println("try-");
            int[] a = new int[0];
            a[0] = 1;
            System.out.println(a[0]+"-");
            return;
        } catch (Exception e) {
            System.out.println("catch-");
        } finally {
            System.out.println("finally");
        }*/
       /* System.out.println("3.0" + 2+1);
        char c = '你';
        System.out.println(c);

        String a = "helloworld";
        String b = "hello" + "world";
        System.out.println(a == b);*/



        /*int i = 012;   // 以0开头的int类型为8进制，即 1 * 8 + 2 * 1 = 10
        char a = 'a';
        System.out.println((i > 11) ? i : a);
        System.out.println((i > 11) ? 65 : a);
        System.out.println((i > 11) ? 65.0 : a);

        System.out.println("" + true + "");*/


        System.out.println(3 / 10);
    }

}