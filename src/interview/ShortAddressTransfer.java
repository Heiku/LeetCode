package interview;

import java.util.Stack;


/**
 * 短网址转换，10进制转换62进制，62进制转换10进制
 *
 */
public class ShortAddressTransfer {

    // 62个字符
    public static final char[] array={'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g',
            'h','j','k','l','z','x','c','v','b','n','m','0','1','2','3','4','5','6','7','8','9','Q',
            'W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};


    public static String _10_to_62_(long number){
        long rest = number;

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        while (rest != 0){
            Long l = new Long((rest - (rest/62) * 62));
            int index = l.intValue();
            stack.add(array[index]);
            rest = rest / 62;
        }

        for (;!stack.isEmpty();){
            result.append(stack.pop());
        }
        return result.toString();
    }


    public static long _62_to_10(String str){
        int multiple = 1;
        long result = 0;
        Character c;

        for (int i = 0; i < str.length(); i++){
            c = str.charAt(str.length() - i - 1);
            result += _62_value(c) * multiple;
            multiple = multiple * 62;
        }
        return result;
    }


    private static int _62_value(Character c){
        for (int i = 0 ; i < array.length; i++){
            if (c == array[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(_10_to_62_(36526445));
        System.out.println(_62_to_10(_10_to_62_(36526445)));
    }
}
