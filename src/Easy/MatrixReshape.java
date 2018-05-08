package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 566
 *
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                list.add(nums[i][j]);
            }
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


        return re;
    }
}
