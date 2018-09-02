package Something;

public class RobotCircle2 {
    public static boolean judgeCircle(String moves) {

        char []m = moves.toCharArray();

        int x = 0;
        int y = 0;

        for (char s : m){
            switch (s){
                case 'L':
                    x--;
                    break;

                case 'R':
                    x++;
                    break;

                case 'U':
                    y++;
                    break;

                case 'D':
                    y--;
                    break;
            }
        }


        return x == 0 && y == 0;
    }
}
