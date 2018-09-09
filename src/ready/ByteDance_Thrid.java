package ready;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/9
 *
 * ip字符串分隔
 */
public class ByteDance_Thrid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();

            int len = str.length();
            if (len < 4){
                System.out.println(0);
                return;
            }

            if (len == 4){
                System.out.println(1);
                return;
            }

            List<String> ipAddress = new ArrayList<>();

            for (int i = 1; i < 4 && i < len - 2; i++){
                for (int j = i + 1; j < i + 4 && j < len - 1; j++){
                    for (int k = j + 1; k < j + 4 && k < len; k++){
                        String s1 = str.substring(0, i);
                        String s2 = str.substring(i, j);
                        String s3 = str.substring(j, k);
                        String s4 = str.substring(k, len);

                        if (check(s1) && check(s2) && check(s3) && check(s4)){
                            ipAddress.add(s1 + "." + s2 + "." + s3 + "." + s4);
                        }
                    }
                }
            }


            System.out.println(ipAddress.size());
        }
    }

    private static boolean check(String s) {
        if (s.length() <= 3 && ((s.charAt(0) != '0' && Integer.valueOf(s) <= 255) || s.equals("0"))){
            return true;
        }else
            return false;
    }


}
