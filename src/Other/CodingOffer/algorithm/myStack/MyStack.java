package Other.CodingOffer.algorithm.myStack;

import java.util.ArrayList;
import java.util.Comparator;

public class MyStack {

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> minList = new ArrayList<>();

    public void push(int node) {
        list.add(node);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int min() {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (min > list.get(i))
                min = list.get(i);
        }

        return min;
    }
}
