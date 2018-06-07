package interview;

/**
 * 1,2,3,4能组成多少个互不相同且无重复数字的三位数？
 *
 */
public class OneToFiveDiffNum {
    public void oneToFiveDiffNum(){

        int count = 0;
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                for (int k = 1; k < 5; k++){
                    if (i !=j && i != k && j !=k){
                        System.out.println(i*100 + j*10 + k);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        new OneToFiveDiffNum().oneToFiveDiffNum();
    }
}
