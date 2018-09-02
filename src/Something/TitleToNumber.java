package Something;

/**
 * 171
 */
public class TitleToNumber {
    public int titleToNumber(String s) {

        char[] c = s.toCharArray();

        if (c.length == 1){
            return c[0] - 64;
        }else {
            int len = c.length;

            int n = (c[0] - 64) * 26;
            int m = c[1] - 64;
            int sum = n + m;
            for (int i = 1; i < len-1; i++) {
                sum = sum * 26 + (c[i+1] - 64);
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        TitleToNumber t = new TitleToNumber();
        System.out.println(t.titleToNumber("AAA"));
    }
}
