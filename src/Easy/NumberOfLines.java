package Easy;

public class NumberOfLines {
    public int[] numberOfLines(int[] widths, String S) {

        int line = 1;
        int sum = 0;
        char []arr = S.toCharArray();
        for (int i = 0; i <= arr.length - 1; i++){

            int index = arr[i] - 97;

            if (sum + widths[index] > 100){
                line++;
                sum = widths[index];
            }else {
                sum += widths[index];
            }
        }

        int []re = new int[]{line, sum};
        return re;
    }
}
