package Other.CodingOffer.algorithm.replaceSpace;

public class ReplaceSpace2 {
    public static String ReplaceBlank(String str){

        int len = str.length();
        int blackNum = 0;
        int newLen = 0;

        for (int i = 0; i < len; i++){
            if (str.charAt(i) == ' '){
                blackNum++;
            }
        }

        // 新数组长度
        newLen = len + blackNum * 2;

        char []chars = new char[newLen];
        int index = newLen - 1;

        // 倒序，每遇到一个空格就在 chars 中添加%20，否则添加原字符
        for (int i = len - 1; i >= 0; i--){
            if (str.charAt(i) == ' '){
                chars[index--] = '0';
                chars[index--] = '2';
                chars[index--] = '%';
            }else {
                chars[index--] = str.charAt(i);
            }
        }


        return new String(chars);
    }


    public static void main(String[] args) {
        System.out.println(ReplaceBlank("We are friends"));
    }
}
