package one.prac.rec;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}};
//        System.out.println(allPath("",arr,0,0));
        int step;
        int[][] path =new int[3][3];
        allPathPrint("",arr,0,0,path, 1 );
    }
    public static ArrayList<String> allPath(String p, boolean[][] maze, int r, int c){
        ArrayList<String> list = new ArrayList<>();
        if(r== maze.length-1 && c==maze[0].length-1){
            list.add(p);
            return list;
        }
        if(!maze[r][c]) {
            return list;
        }

        //i am considering this block in my path hence set it as false
        maze[r][c]=false;

        if (r<maze.length-1) {
            list.addAll(allPath(p + "D", maze,r+1,c));
        }

        if(c<maze[0].length-1){
            list.addAll(allPath(p + "R", maze,r,c+1));
        }
        if (r>0) {
            list.addAll(allPath(p + "U", maze,r-1,c));
        }
        if (c>0) {
            list.addAll(allPath(p + "L", maze,r,c-1));
        }
        //this line is where the function will be over
        //so before the function gets removed, also remomved the changes that were made by the function
        maze[r][c]=true;
        return list;
    }
    public static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){

        if(r== maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;

            for (int[] arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if(!maze[r][c]) {
            return;
        }

        //i am considering this block in my path hence set it as false
        maze[r][c]=false;
        path[r][c]=step;
        if (r<maze.length-1) {
            allPathPrint(p + "D", maze,r+1,c,path,step+1);
        }

        if(c<maze[0].length-1){
            allPathPrint(p + "R", maze,r,c+1,path,step+1);
        }
        if (r>0) {
            allPathPrint(p + "U", maze,r-1,c,path,step+1);
        }
        if (c>0) {
            allPathPrint(p + "L", maze,r,c-1,path,step+1);
        }
        //this line is where the function will be over
        //so before the function gets removed, also remomved the changes that were made by the function
        maze[r][c]=true;
        path[r][c]=0;

        return;
    }
}
