package Easy;

/**
 * 463
 *
 * 思路：在所有的岛屿中，找出与其相邻的岛屿（从右下找，也就是说除了底行和最右行），最后根据边长相减得到
 */
public class IsLandPerimeter {
    public int islandPerimeter(int[][] grid) {

        int all = 0;
        int n = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 1){
                    all++;

                    if (i < grid.length - 1 && grid[i+1][j] == 1)
                        n++;
                    if (j < grid[i].length && grid[i][j+1] == 1)
                        n++;
                }
            }
        }

        return 4 * all - 2 * n;
    }
}
