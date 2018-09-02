package Something;

/**
 * 258
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            num = (num- 1) % 9 + 1;
            return num;
        }

    }

    public static void main(String[] args) {
        AddDigits a = new AddDigits();
        System.out.println(a.addDigits(10));
    }
}
