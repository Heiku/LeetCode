package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 412
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){

            String s = "";
            if (i % 3 == 0 && i % 5 == 0){
                s = "FizzBuzz";
            }else if (i % 3 == 0){
                s = "Fizz";
            }else  if (i % 5 == 0){
                s = "Buzz";
            }else {
                s = String.valueOf(i);
            }

            list.add(s);
        }


        return list;
    }
}
