package Something;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Heiku on 2018/9/2
 *
 * 56. Merge Intervals
 *
 *
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * Example 1:
 *
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 *
 *
 * Example 2:
 * Input: [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
 *
 */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> newList = new ArrayList<>();

        if (intervals.isEmpty())
            return newList;


        newList.add(intervals.get(0));



        for (int i = 0; i < intervals.size(); i++){
            Interval entry = intervals.get(i);
            Interval last = newList.get(newList.size() - 1);

            if (entry.start <= last.end && entry.start >= last.start)
                last.end = Math.max(last.end, entry.end);
            else if (entry.start <= last.end && entry.start < last.start)
                last.start = Math.min(last.start, entry.start);
            else
                newList.add(entry);
        }

        return newList;
    }
}
