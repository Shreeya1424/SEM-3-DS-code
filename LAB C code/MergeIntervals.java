import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {
                // Overlapping, merge the intervals
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // Non-overlapping, add the current interval to the result
                result.add(currentInterval);
                currentInterval = intervals[i];
            }
        }

        result.add(currentInterval); // Add the last interval
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] merged1 = merge(intervals1);
        System.out.println(Arrays.deepToString(merged1)); // Output: [[1, 4], [6, 8], [9, 10]]

        int[][] intervals2 = {{6, 8}, {1, 9}, {2, 4}, {4, 7}};
        int[][] merged2 = merge(intervals2);
        System.out.println(Arrays.deepToString(merged2)); // Output: [[1, 9]]
    }
}

