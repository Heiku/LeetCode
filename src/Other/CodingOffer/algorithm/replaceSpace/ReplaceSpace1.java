package Other.CodingOffer.algorithm.replaceSpace;

/**
 * 利用StringBuffer替换空格
 */
public class ReplaceSpace1 {
    public static String ReplaceBlank(String str){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <str.length(); i++){
            if (str.charAt(i) == ' ')
                sb.append("%20");
            else
                sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
