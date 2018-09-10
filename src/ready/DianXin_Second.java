package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/10
 *
 * 丑数
 */
public class DianXin_Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            int n = sc.nextInt();

            if(n==0){
                System.out.println(0);
                return;
            }
            int[] a = new int[n];
            int count = 1;
            a[0] = 1;
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            while(count<n){
                int min = min(a[n1]*2,a[n2]*3,a[n3]*5);
                a[count] = min;
                while(a[n1]*2<=a[count]) n1++;
                while(a[n2]*3<=a[count]) n2++;
                while(a[n3]*5<=a[count]) n3++;
                count++;
            }
            int result = a[n-1];
            System.out.println(result);
        }
        
    }

    public static int min(int a,int b,int c){
        int temp = a>b?b:a;
        return temp>c?c:temp;
    }

}
