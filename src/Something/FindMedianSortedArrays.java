package Something;

import java.util.Arrays;

/**
 * Created by Heiku on 2018/9/17
 *
 * 4. Median of Two Sorted Arrays
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 *
 *
 * 题目：找出两个有序数组中的中位数
 *
 *
 * 思路：（1）合并两数组，再进行取中位数
 *       （2） 递归分成两数组查找
 *
 */
public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length, m = nums2.length;

        int left = (m + n + 1) / 2;
        int right = (m + n + 2) / 2;

        return (findKth(nums1, nums2, left) + findKth(nums1, nums2, right)) / 2.0;
    }


    int findKth(int[] nums1, int[] nums2, int k){
        int n = nums1.length, m = nums2.length;

        if (n > m)
            return findKth(nums2, nums1, k);

        if (n == 0)
            return nums2[k - 1];

        if (k == 1)
            return Math.min(nums1[0] , nums2[0]);

        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);

        if (nums1[i - 1] > nums2[j - 1])
            return findKth(nums1, Arrays.copyOfRange(nums2, j, m), k - j);
        else
            return findKth(Arrays.copyOfRange(nums1, i, n), nums2, k - i);
    }





    // 合并结果的解法
    /*public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length, m = nums2.length;

        if (n == 0 && m == 0)
            return 0;

        int[] arr = new int[n + m];
        int index = 0;
        double res = 0;

        int mid = (n + m) / 2;

        for (int i = 0, j = 0 ; i < n || j < m;){

            *//*if (index - 1 == mid)
                break;*//*

            if (i >= n || (j < m && nums1[i] > nums2[j])) {         // 关键在于这里，要进行两次判断，判断是否越界，越界则取长度较长的数组存放
                arr[index++] = nums2[j];
                j++;
            } else {
                arr[index++] = nums1[i];
                i++;
            }
        }

        res = (n + m) % 2 == 0 ? (arr[mid] + arr[mid - 1]) / 2 : arr[mid];

        return res;
    }*/


   /* public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if (n < m)
            return findMedianSortedArrays(nums2, nums1);     // make sure 1 > 2

        int lo = 0, hi = m * 2;
        while (lo <= hi){

            int mid2 = (lo + hi) / 2;
            int mid1 = n + m - mid2;

            double L1 = (mid1 == 0) ? Double.MIN_VALUE : nums1[(mid1 - 1) / 2];
            double L2 = (mid2 == 0) ? Double.MIN_VALUE : nums2[(mid2 - 1) / 2];
            double R1 = (mid1 == n * 2) ? Double.MAX_VALUE : nums1[mid1 / 2];
            double R2 = (mid2 == m * 2) ? Double.MAX_VALUE : nums2[mid2 / 2];

            if (L1 > R2)
                lo = mid2 + 1;
            else if (L2 > R1)
                hi = mid2 - 1;
            else
                return (Double.max(L1, L2) + Double.min(R1, R2)) / 2;


        }
        return -1;


    }*/

    public static void main(String[] args) {

        int []num1 = {1,3}, num2 = {2};
        new FindMedianSortedArrays().findMedianSortedArrays(num1, num2);
    }
}
