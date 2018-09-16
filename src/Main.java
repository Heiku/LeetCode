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


        /*public int GetUglyNumber_Solution(int index) {
            int count = 0;
            int i;
            for(i=1;count<=index;i++){
                if(isUgly(i))
                    count++;
            }
            return i;
        }

        public boolean isUgly(int n){
            while(n%3==0)
                n = n/3;
            while(n%2==0)
                n = n/2;
            while(n%5==0)
                n = n/5;
            if(n==1)
                return true;
            else
                return false;
        }*/


        /*if(a==1||b==1)     // 两个正整数中，只有其中一个数值为1，两个正整数为互质数
            return true;
        while(1){          // 求出两个正整数的最大公约数
            int t = a%b;
            if(t == 0) break;
            else{
                a = b;
                b = t;
            }
        }
        if(b>1)	return false;// 如果最大公约数大于1，表示两个正整数不互质
        else return true;	// 如果最大公约数等于1,表示两个正整数互质*/
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

}