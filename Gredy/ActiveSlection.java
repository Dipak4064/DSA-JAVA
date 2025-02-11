package Gredy;

import java.util.ArrayList;

/* ActiveSlection, Disjoint && maximum mettins in a room all are use the same logic */
public class ActiveSlection {
    public static void main(String[] args) { // TC = O(n);
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        /*
         * // This code for unsorted End Activity
         * int activities[][] = new int[start.length][3];
         * for (int i = 0; i < start.length; i++) {
         * activities[i][0] = i;
         * activities[i][1] = start[i];
         * activities[i][2] = end[i];
         * }
         * // labda function
         * Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
         * // end time basis sorted
         * int maxAct = 0;
         * ArrayList<Integer> ans = new ArrayList<>();
         * // add first activity
         * maxAct = 1;
         * ans.add(activities[0][0]);
         * int lastEnd = activities[0][2];
         * for (int i = 1; i < end.length; i++) {
         * if (activities[i][1] >= lastEnd) {
         * // activity select
         * maxAct++;
         * ans.add(activities[i][0]);
         * lastEnd = activities[i][2];
         * 
         * }
         * }
         */

        // This code for sorted End Activity
        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // add first activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Maximum Activity: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + (ans.get(i) + 1));
        }
    }
}
