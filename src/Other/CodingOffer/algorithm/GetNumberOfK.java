package Other.CodingOffer.algorithm;

/**
 * Created by Heiku on 2018/7/29
 *
 * 题目：统计一个数字在排序数组中出现的次数。
 *
 * 思路：排序数组 -> 二分查找，找出对应数字的start, end，对应的num = end - start + 1
 *                  二分可以使用递归和非递归，注意二分查找的遇到左右相同的情况
 */
public class GetNumberOfK {

    /*public int GetNumberOfK(int [] array , int k) {

        int len = array.length;
        if (len <= 0)
            return 0;

        int firstK = getFirstK(array, 0, len - 1, k);
        int lastK = getLastK(array, 0, len - 1, k);

        if (firstK != -1 && lastK != -1)
            return lastK - firstK+ 1;
    }


    int getFirstK(int[] arr, int lo, int hi, int k){
        if (lo > hi)
            return -1;

        int mid = (lo + hi) / 2;
        if (arr[mid] < k){
            return getFirstK(arr, mid + 1, hi, k);
        }else if (arr[mid] > k){
            return getFirstK(arr, lo, mid - 1, k);
        }else if (mid - 1 >= 0 && arr[mid - 1] == k){ // mid左边还是等于k，继续往左
            return getFirstK(arr, lo, mid - 1, k);
        }else
            return mid;
    }

    int getLastK(int[] arr, int lo, int hi, int k){
        int len = arr.length;
        int mid = (lo + hi) / 2;

        while (lo <= hi){
            if (arr[mid] < k){
                lo = mid + 1;
            }else if (arr[mid] > k){
                hi = mid - 1;
            }else if (mid+1 < len &&arr[mid+1] == k){
                lo = mid + 1;
            }else
                return mid;

            mid = (lo + hi) /2;
        }
        return -1;
    }*/

    public int GetNumberOfK(int [] array , int k) {
        int len = array.length;
        if (len <= 0)
            return 0;

        int firstK = getFirstK(array, 0, array.length - 1, k);
        int lastK = getLastK(array, 0, array.length - 1, k);

        if (firstK != -1 && lastK != -1)
            return lastK - firstK + 1;

        return 0;
    }

    int getFirstK(int[] arr, int lo, int hi, int k){
        if (lo > hi)
            return -1;

        int mid = (lo + hi) / 2;
        if (arr[mid] < k){
            return getFirstK(arr, mid + 1, hi, k);
        }else if (arr[mid] > k){
            return getFirstK(arr, lo, mid - 1, k);
        }else if (mid - 1 >= 0 && arr[mid - 1] == k){
            return getFirstK(arr, lo, mid - 1, k);
        }else
            return mid;

    }

    int getLastK(int []arr, int lo, int hi, int k){
        if (lo > hi)
            return -1;

        int mid = (lo + hi) / 2;
        while (lo <= hi){
            if (arr[mid] < k){
                lo = mid + 1;
            }else if (arr[mid] > k){
                hi = mid - 1;
            }else if (mid + 1 < arr.length && arr[mid + 1] == k){
                lo = mid + 1;
            }else {
                return mid;
            }

            mid = (lo + hi) / 2;
        }
        return -1;
    }
}
