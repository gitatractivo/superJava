package one.prac.rec;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        boolean[][] arr = {
//                {true,true,true},
//                {true,true,false},
//                {true,true,true}};
//        System.out.println(pathWithRestrictions("",arr,0,0));
        System.out.println(count(51,9));
    }


    public static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        return count(r-1,c)+count(r,c-1);
    }

    public static ArrayList<String> path(String p, int r, int c){
        ArrayList<String> list = new ArrayList<>();
        if(r==1 && c==1){
            list.add(p);
            return list;
        }
        if (r!= 1) {
            list.addAll(path(p + "D", r-1,c));
        }
        if(c!=1){
            list.addAll(path(p + "R", r,c-1));
        }
        return list;
    }
    public static ArrayList<String> pathDiagnol(String p, int r, int c){
        ArrayList<String> list = new ArrayList<>();
        if(r==1 && c==1){
            list.add(p);
            return list;
        }
        if (r!= 1) {
            list.addAll(pathDiagnol(p + "H", r-1,c));
        }
        if(c!=1){
            list.addAll(pathDiagnol(p + "V", r,c-1));
        }
        if(c!=1 && r!=1){
            list.addAll(pathDiagnol(p + "D", r-1,c-1));
        }
        return list;
    }
    public static ArrayList<String> pathWithRestrictions(String p,boolean[][] maze, int r, int c){
        ArrayList<String> list = new ArrayList<>();
        if(r== maze.length-1 && c==maze[0].length-1){
            list.add(p);
            return list;
        }
        if(!maze[r][c]) {
            return list;
        }
        if (r<maze.length-1) {
            list.addAll(pathWithRestrictions(p + "D", maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(pathWithRestrictions(p + "R", maze,r,c+1));
        }
        return list;
    }
}
