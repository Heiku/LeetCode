package Something;

/**
 * 解题思路：
 * 找到非4的倍数的数
 */
public class NimGame {
    public boolean canWinNim(int n) {
        if (n % 4 == 0)
            return false;
        else
            return true;
    }
}
