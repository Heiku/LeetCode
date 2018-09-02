package Something;

/**
 * 566
 *
 * 解题思路：先判断是否需要变换数组的形态，再根据row，col进行划分
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        /*List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                list.add(nums[i][j]);
            }
        }

        if (nums.length < r && nums[0].length < c){
            return nums;
        }

        int [][]re = new int[r][c];

        int len = list.size();
        int z = 0;
        if (r * c > len){
            if (r > c){
                z = len / c;
                re = new int[z][c];

                for (int i = 0; i < z; i++){
                    for (int j = 0; j < c; j++){
                        re[i][j] = list.get(j);
                    }

                    for (int k = 0; k < c; k++){
                        list.remove(0);
                    }
                }
            }else{
                z = len / r;
                re = new int[r][z];

                for (int i = 0; i < r; i++){
                    for (int j = 0; j < z; j++){
                        re[i][j] = list.get(j);
                    }

                    for (int k = 0; k < z; k++){
                        list.remove(0);
                    }
                }
            }
        }else {
            for (int i = 0; i < r; i++){
                for (int j = 0; j < c; j++){
                    re[i][j] = list.get(j);
                }

                for (int k = 0; k < c; k++){
                    list.remove(0);
                }
            }
        }
        return re;*/

        int original_r = nums.length;
        int original_c = nums[0].length;
        if (original_r * original_c == r * c) {
            int[][] result = new int[r][c];
            for (int i = 0; i < r * c; i++) {
                result[i / c][i % c] = nums[i / original_c][i % original_c];
            }
            return result;
        } else {
            return nums;
        }
    }
}
