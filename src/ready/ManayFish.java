package ready;

import java.util.Scanner;

/**
 * Created by Heiku on 2018/8/20
 *
 * 题目：链接：https://www.nowcoder.com/questionTerminal/e3dd485dd23a42899228305658457927?toCommentId=1295616
 * 来源：牛客网
 *
 * 牛牛有一个鱼缸。鱼缸里面已经有n条鱼，每条鱼的大小为fishSize[i] (1 ≤ i ≤ n,均为正整数)，牛牛现在想把新捕捉的鱼放入鱼缸。
 * 鱼缸内存在着大鱼吃小鱼的定律。经过观察，牛牛发现一条鱼A的大小为另外一条鱼B大小的2倍到10倍(包括2倍大小和10倍大小)，鱼A会吃掉鱼B。
 *  考虑到这个，牛牛要放入的鱼就需要保证：
 * 1、放进去的鱼是安全的，不会被其他鱼吃掉
 * 2、这条鱼放进去也不能吃掉其他鱼
 * 鱼缸里面已经存在的鱼已经相处了很久，不考虑他们互相捕食。放入的新鱼之间也不会相互捕食。
 * 现在知道新放入鱼的大小范围[minSize,maxSize](考虑鱼的大小都是整数表示),牛牛想知道有多少种大小的鱼可以放入这个鱼缸。
 *
 *
 * 输入数据包括3行. 第一行为新放入鱼的尺寸范围minSize,maxSize(1 ≤ minSize,maxSize ≤ 1000)，以空格分隔。
 *  第二行为鱼缸里面已经有鱼的数量n(1 ≤ n ≤ 50)
 *  第三行为已经有的鱼的大小fishSize[i](1 ≤ fishSize[i] ≤ 1000)，以空格分隔。
 *
 *  input
 *  1 12 1 1
 *
 *  output
 *  3
 */
public class ManayFish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 小鱼
        int minSize = sc.nextInt();
        // 大鱼
        int maxSize = sc.nextInt();

        // 已有数量
        int hasCount = sc.nextInt();
        int[] nums = new int[hasCount];
        for (int i = 0; i < hasCount; i++){
            nums[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = minSize; i < maxSize; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[j] * 2 <= i && nums[j] * 10 >= i || nums[j] >= 2 * i && nums[j] <= 10 * i){
                    result++;
                    break;
                }
            }
        }

        System.out.println(maxSize - minSize + 1 - result);
    }
}
