package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/15
 */
public class WeiPinHui_Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String a = sc.next();
            String b = sc.next();

            int lenA = a.length() - 1;
            int lenB = b.length() - 1;
            int k = 0;


            StringBuilder sb = new StringBuilder();

            while (lenA >=0 || lenB >= 0){
                int total = k;

                if (lenA >= 0){
                    total += a.charAt(lenA) - '0';
                    lenA--;
                }

                if (lenB >= 0){
                    total += b.charAt(lenB) - '0';
                    lenB--;
                }

                sb.append(total % 2);
                k = total / 2;
            }

            if (k != 0)
                sb.append(k);


            String res = sb.reverse().toString();

            System.out.println(res);
        }
    }
}
