package Easy;


/**
 * 解题思路：
 * 构造出与输入参数相同长度的二进制1111..,再进行异或操作
 */
public class FindComplement {
    public int findComplement(int num) {

        int i = 0;
        int j = 0;
        while (i < num){
            i += Math.pow(2, j);
            j++;
        }

        return num ^ i;
    }

    public static void main(String[] args) {
        FindComplement f = new FindComplement();
        System.out.println(f.findComplement(5));
    }

}
