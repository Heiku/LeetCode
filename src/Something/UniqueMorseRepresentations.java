package Something;

import java.util.ArrayList;
import java.util.List;

public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {

        List<String> list = new ArrayList<>();
        String []morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String word : words){
            char []arr_word = word.toCharArray();

            String morseStr = "";
            for (char c : arr_word){
                int index = c - 'a';

                morseStr += morse[index];
            }

            list.add(morseStr);

        }


        List<String> diff = new ArrayList<>();
        if (list.size() == 1){
            return 1;
        }else {
            for (String s : list){
                if (!diff.contains(s))
                    diff.add(s);
            }
        }

        return diff.size();
    }

    public static void main(String[] args) {
        String []words = new String[]{"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        UniqueMorseRepresentations u = new UniqueMorseRepresentations();
        System.out.println(u.uniqueMorseRepresentations(words));
    }
}
