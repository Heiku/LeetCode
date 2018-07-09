package interview;

import java.util.HashMap;
import java.util.LinkedList;


/**
 * 题目：实现一个LRU
 */
public class LRUCache {

    private int capacity;
    private HashMap<Integer, Integer> map;
    private LinkedList<Integer> list;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        list = new LinkedList<>();
    }


    public Integer get(int key){
        if (map.containsKey(key)){
            list.removeFirstOccurrence(key);
            list.addFirst(key);

            return map.get(key);
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {

        if (!map.containsKey(key)){
            if (list.size() == capacity){
                int last = list.removeLast();
                map.remove(last);
            }

            list.addFirst(key);
            map.put(key, value);

        }else {
            list.removeFirstOccurrence(key);
            list.addFirst(key);

            map.put(key, value);
        }
    }
}
