package nothing;

/**
 * Created by Heiku on 2018/9/11
 *
 * 关于switch使用（char， byte， int， Character， Integer， Byte， String， Enum），但不支持long
 * long的长度过长，转换精度丢失
 */
public class SwitchTest {
    public static void main(String[] args) {

        /*int i = 12;
        long j = 5;*/


        int i = 12;
        int j = 5;

        switch (i / j){

            case 2:
                j += 5;

            case 1: i += 1;

            default: i += 1;
        }

        System.out.println(i);
        System.out.println(j);

    }
}
