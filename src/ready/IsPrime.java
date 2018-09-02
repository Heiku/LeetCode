package ready;

/**
 * Created by Heiku on 2018/9/2
 */
public class IsPrime {

    public boolean isPrime(int n){
        if (n == 2)
            return true;

        if (n < 2 || n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPrime().isPrime(9));
    }
}
