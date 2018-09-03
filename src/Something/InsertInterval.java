package Something;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Heiku on 2018/9/2
 *
 * 57. Insert Interval
 *
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 *
 * You may assume that the intervals were initially sorted according to their start times.
 *
 * Example 1:
 *
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 * Example 2:
 *
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 *
 * [1,2]
 * [1,2][3,5] <- insert[4,8]
 * [1,2][3,8]
 * [1,2][3,8][6,7]
 * [1,2][3,8]
 * [1,2][3,8][8,10]
 * [1,2][3,10]
 * [1,2][3,10][12,16]
 *
 * 题目：给几个有序的子数组，插入指定的数组，同时使子数组有序且不存在交集
 *
 * 思路：先创建一个newList存放第一个集合，接着不断尾放入判断是否会有交集，有的话则选取最大的值为右边界
 */
public class InsertInterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);

        // 根据start降序排序
        Collections.sort(intervals, Comparator.comparingInt(e -> e.start));


        List<Interval> newList = new ArrayList<>();
        newList.add(intervals.get(0));


        for (int i = 1; i < intervals.size(); i++){
            Interval entry = intervals.get(i);
            Interval last = intervals.get(newList.size() - 1);

            if (entry.start <= last.end && entry.start >= last.start )
                last.end = Math.max(last.end, entry.end);
            else
                newList.add(entry);
        }

        return newList;
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;

    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
