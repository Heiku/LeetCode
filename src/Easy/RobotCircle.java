package Easy;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class RobotCircle {
    public static boolean judgeCircle(String moves) {
        String []m = moves.split("");

        ArrayList list = new ArrayList();
        for (String s : m){
            switch (s){
                case "L":
                    if (!list.isEmpty() && list.contains("R"))
                        list.remove("R");
                    else
                        list.add("L");
                    break;

                case "R":
                    if (!list.isEmpty() && list.contains("L"))
                        list.remove("L");
                    else
                        list.add("R");
                    break;

                case "U":
                    if (!list.isEmpty() && list.contains("D"))
                        list.remove("D");
                    else
                        list.add("U");
                    break;

                case "D":
                    if (!list.isEmpty() && list.contains("U"))
                        list.remove("U");
                    else
                        list.add("D");
                    break;
            }


        }

        if (list.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }

}
