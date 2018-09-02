package Something;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：找出数组中是否包含在键盘同一行的单词
 * 解题思路：先找首字母，再一次找每个单词的字母是否包含在其首字母列中
 */
public class FindWords {



    public String[] findWords(String[] words) {

        List<String> list = new ArrayList<>();
        for (String w : words){

            char []word = w.toCharArray();

            int con = 1;
            char firstChar = word[0];

            //in top
            if (containA(firstChar)){
                for (int i = 1; i <= word.length - 1; i++){
                    if (containA(word[i]))
                        con = 1;
                    else {
                        con = 0;
                        break;
                    }
                }
            }else if (containB(firstChar)){
                for (int i = 1; i <= word.length - 1; i++){
                    if (containB(word[i]))
                        con = 1;
                    else {
                        con = 0;
                        break;
                    }
                }

            }else if (containC(firstChar)){
                for (int i = 1; i <= word.length - 1; i++){
                    if (containC(word[i]))
                        con = 1;
                    else {
                        con = 0;
                        break;
                    }
                }
            }

            if (con == 1){
                list.add(w);
            }
        }

        String []re = new String[list.size()];
        for (int i = 0; i <= list.size() - 1; i++){
            re[i] = list.get(i);
        }

        return re;
    }

    public static boolean containA(char letter){

        char []a = {'Q','W','E','R','T','Y','U','I','O','P','q','w','e','r','t','y','u','i','o','p'};

        for (char i : a){
            if (i == letter){
                return true;
            }
        }

        return false;
    }

    public static boolean containB(char letter){
        char []b = {'A','S','D','F','G','H','J','K','L','a','s','d','f','g','h','j','k','l'};

        for (char i : b){
            if (i == letter){
                return true;
            }
        }
        return false;
    }


    public static boolean containC(char letter){
        char []c = {'Z', 'X','C','V','B','N','M','z','x', 'c','v','b','n','m'};

        for (char i : c){
            if (i == letter){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String []words = new String[]{"a", "b"};
        FindWords fd = new FindWords();
        System.out.println(fd.findWords(words));
    }
}
