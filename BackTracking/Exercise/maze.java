package Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class maze {
    public static void Helper(ArrayList<int[]> maze, int row, int col, String path, ArrayList<String> ans,
            ArrayList<int[]> visited) {
        int n = maze.size();
        int m = maze.get(0).length;
        if (col < 0 || row < 0 || col >= m || row >= n || maze.get(row)[col] == 0
                || visited.get(row)[col] == 1) {
            return;
        }
        if (row == n - 1 && col == m - 1) {
            ans.add(path);
            return;
        }
        visited.get(row)[col] = 1;
        Helper(maze, row + 1, col, path + "D", ans, visited);
        Helper(maze, row - 1, col, path + "U", ans, visited);
        Helper(maze, row, col + 1, path + "R", ans, visited);
        Helper(maze, row, col - 1, path + "L", ans, visited);
        visited.get(row)[col] = 0;
    }

    public static void main(String[] args) {
        ArrayList<int[]> maze = new ArrayList<>();
        int[] list1 = { 1, 0, 0, 0 };
        int[] list2 = { 1, 1, 0, 0 };
        int[] list3 = { 1, 1, 0, 0 };
        int[] list4 = { 0, 1, 1, 1 };
        maze.addAll(Arrays.asList(list1, list2, list3, list4));

        ArrayList<String> ans = new ArrayList<>();
        ArrayList<int[]> visited = new ArrayList<>();
        for (int i = 0; i < maze.size(); i++) {
            int[] row = new int[maze.get(0).length];
            Arrays.fill(row, 0);
            visited.add(row);
        }
        Helper(maze, 0, 0, "", ans, visited);
        System.out.println(ans);
    }
}

// This code is for ArrayList of ArrayLists
/*
 * import java.util.ArrayList;
 * import java.util.Arrays;
 * 
 * public class practice {
 * public static void Helper(ArrayList<ArrayList<Integer>> maze, int row, int
 * col, String path, ArrayList<String> ans,
 * ArrayList<ArrayList<Integer>> visited) {
 * int n = maze.size();
 * int m = maze.get(0).size();
 * if (col < 0 || row < 0 || col >= m || row >= n || maze.get(row).get(col) == 0
 * || visited.get(row).get(col) == 1) {
 * return;
 * }
 * if (row == n - 1 && col == m - 1) {
 * ans.add(path);
 * return;
 * }
 * visited.get(row).set(col, 1);
 * Helper(maze, row + 1, col, path + "D", ans, visited);
 * Helper(maze, row - 1, col, path + "U", ans, visited);
 * Helper(maze, row, col + 1, path + "R", ans, visited);
 * Helper(maze, row, col - 1, path + "L", ans, visited);
 * visited.get(row).set(col, 0);
 * }
 * 
 * public static void main(String[] args) {
 * ArrayList<ArrayList<Integer>> maze = new ArrayList<>();
 * maze.add(new ArrayList<>(Arrays.asList(1, 1)));
 * maze.add(new ArrayList<>(Arrays.asList(0, 1)));
 * ArrayList<ArrayList<Integer>> visited = new ArrayList<>();
 * for (int i = 0; i < 4; i++) {
 * ArrayList<Integer> row = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
 * visited.add(row);
 * }
 * 
 * ArrayList<String> ans = new ArrayList<>();
 * 
 * Helper(maze, 0, 0, "", ans, visited);
 * 
 * System.out.println(ans);
 * }
 * }
 */