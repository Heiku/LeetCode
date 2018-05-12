package Easy;

import java.util.Stack;

/**
 * 682
 */
public class CalPoints {
    public int calPoints(String[] ops) {


        int count = 0;
        Stack<Integer> stack = new Stack<>();

        for (String s : ops){
            int now = 0;

            if (s.equals("+")) {
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();

                now = a + b;
                stack.push(a);
                stack.push(now);
                count += now;
            }else if (s.equals("D")){
                int c = stack.peek();
                now = 2 * c;
                stack.push( now);
                count += now;
            }else if (s.equals("C")){
                int d = stack.peek();
                stack.pop();
                count -= d;
            }else {
                int e = Integer.parseInt(s);
                now = e;
                stack.push(now);
                count += now;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String []arr = new String[]{"5","2","C","D","+"};
        CalPoints c = new CalPoints();
        c.calPoints(arr);
    }
}
