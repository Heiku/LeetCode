package ready;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Heiku on 2018/9/8
 */
public class First {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        int len = s.length();
        char[] ch = s.toCharArray();
        ArrayList<Integer> index = new ArrayList<>();


        for(int i=0;i<len-1;i++) {
            if(ch[i]==ch[i+1]) {
                index.add(i);
            }
        }

        if(index.size()==0) {
            System.out.println(len);
            return;
        }

        int max = index.get(0)+1;
        int[] value = new int[index.size()+1];
        value[0] = max;
        for(int i=1;i<index.size();i++) {
            int length = index.get(i)-index.get(i-1);
            value[i] = length;
            max = Math.max(max, length);
        }


        max = Math.max(max, len-1-index.get(index.size()-1));
        value[index.size()] = len-1-index.get(index.size()-1);
        if(ch[0]!=ch[len-1]) {
            max = Math.max(value[0]+value[index.size()], max);
        }


        int ii = 1;
        for(int i=1;i<index.size();i++) {
            int length = 0;
            if(ch[i]!=ch[len-1]) {
                length = value[index.size()]+value[ii];
            }
            ii++;
            max = Math.max(max, length);
        }

        System.out.println(max);
    }

}
