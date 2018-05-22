package Other.CodingOffer.algorithm.binaryOne;

/**
 * 1001 1
 */
public class binaryFindOne {

    public static int BinaryFindOne(int n){
        //return Integer.bitCount(n);

        int count = 0;
        while (n > 0){
            if ((n & 1) == 1)
                count++;

            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(BinaryFindOne(9));
    }
}
