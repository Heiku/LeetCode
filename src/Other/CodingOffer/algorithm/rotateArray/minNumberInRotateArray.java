package Other.CodingOffer.algorithm.rotateArray;


/**
 * 题目：找出旋转数组中最小的数 34123
 *
 * 思路：利用二分法，不断判断mid 与 hi 的大小，判断mid在哪个分区，最后范围缩小得到的lo就是最小数
 */
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int[] arr) {

        int lo = 0;
        int hi = arr.length - 1;

        if (arr == null || arr.length < 0){
            return 0;
        }

        while (lo < hi){
            int mid = (lo + hi) / 2;

            // mid在左半边
            if (arr[mid] > arr[hi])
                lo = mid + 1;
            // 在左半边 hi-1缩小范围
            else if (arr[mid] == arr[hi])
                hi = hi - 1;
            // 在右半边
            else
                hi = mid;
        }

        return arr[lo];
    }
}
