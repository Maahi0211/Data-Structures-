package Backtracking;

import java.util.ArrayList;

public class RatInAMaze {
    public static void findPath(int[][] arr, boolean[][] visited, int i, int j, String path, ArrayList<String> ans){
        int rows=arr[0].length-1;
        int cols=arr.length-1;
        if(arr[i][j]==arr[rows][cols]){
            ans.add(path);
            return;
        }
        visited[i][j]=true;

        if(check(arr, i, j+1, visited)){
            findPath(arr, visited, i, j+1, path+"D", ans);
        }

        if(check(arr, i, j-1, visited)){
            findPath(arr, visited, i, j-1, path+"U", ans);
        }

        if(check(arr, i+1, j, visited)){
            findPath(arr, visited, i+1, j, path+"R", ans);
        }

        if(check(arr, i-1, j, visited)){
            findPath(arr, visited, i-1, j, path+"L", ans);
        }
        visited[i][j] = false;
    }
    public static boolean check(int[][] arr, int i, int j, boolean[][] visited){
        return arr[i][j + 1] == 1 && arr[i + 1][j] == 1 && arr[i - 1][j] == 1 && arr[i][j - 1] == 1 && arr[i][j] <= arr[0].length - 1 && arr[i][j] <= arr.length - 1 && !visited[i][j];
    }

    public static void main(String[] args) {
        int [][]arr={
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        ArrayList<String> ans = new ArrayList<>();

        if(arr[0][0] == 1){
            boolean [][] visited = new boolean[arr[0].length][arr.length];
            findPath(arr, visited, 0, 0, " ", ans);
        }
        System.out.println(ans);
    }
}
