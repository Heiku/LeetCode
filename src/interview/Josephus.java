package interview;


/**
 * 约瑟夫问题，O(n)
 */
public class Josephus {

    int josephus(int n,int m, int k){

        int s = 0;
        for (int i = 2; i <= n; ++i){
            s = (s + m) % i;
        }

        return (s + k) % n;
    }

    public static void main(String[] args) {
        new Josephus().josephus(12, 2, 0);
    }
}
