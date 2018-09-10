package nothing;

/**
 * Created by Heiku on 2018/9/10
 */
public class IntegerEqualInt {
    public static void main(String[] args) {

        Integer i = 2;
        Integer j = new Integer(2);

        int k = 2;

        System.out.print("Integer != new Integer()  ");
        System.out.println(i == j);

        System.out.print("int == Integer  ");
        System.out.println(i == k);


        System.out.print("int != new Integer()?     ");
        System.out.println(i == j);
    }
}
