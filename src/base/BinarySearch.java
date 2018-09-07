package base;

/**
 * Created by Heiku on 2018/9/8
 *
 * 二分查找
 */
public class BinarySearch {

    public int search(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (key == arr[mid]){
                return mid;
            }else if (key < arr[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
