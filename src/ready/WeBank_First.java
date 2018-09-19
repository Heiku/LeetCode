package ready;

/**
 * Created by Heiku on 2018/9/18
 */
public class WeBank_First {

    public static void main(String[] args) {

    }

    static String GetResult(int n){

        int k = n;

        int i = 0;
        for (; k - i > 0; i++){
            k -= i;
        }

        int j = i - 1;
        i = i - (k - (i - 1) * i / 2 + 1);

        return j - i + "/" + i;
    }
}
