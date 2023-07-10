package one.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _149 {
    public static void main(String[] args) {
        int[][] arr = {{54,153},{1,3},{0,-72},{-3,3},{12,-22},{-60,-322},{0,-5},{-5,1},{5,5},{36,78},{3,-4},{5,0},{0,4},{-30,-197},{-5,0},{60,178},{0,0},{30,53},{24,28},{4,5},{2,-2},{-18,-147},{-24,-172},{-36,-222},{-42,-247},{2,3},{-12,-122},{-54,-297},{6,-47},{-5,3},{-48,-272},{-4,-2},{3,-2},{0,2},{48,128},{4,3},{2,4}
        };
        System.out.println(maxPoints1(new int[][]{{1,1},{2,2},{3,3}}));
        System.out.println(maxPoints1(new int[][]{{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}}));
        System.out.println(maxPoints(new int[][]{{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}}));

        System.out.println(maxPoints(arr));
        System.out.println(maxPoints1(arr));



    }
    static HashMap<Line, Integer> hm = new HashMap<>();
    private static class Point{
        int x,y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    private static class Line{
        Float m,c;
        Line(){

        }

    }
    public static int maxPoints(int[][] points) {


        if(points.length<3)    return points.length;
        ArrayList<Point> list = new ArrayList<>();
        list.add(new Point(points[0][0],points[0][1]));
        for (int i = 1; i < points.length; i++) {
            Point p = new Point(points[i][0],points[i][1]);
            boolean onLine = false;

            for (Line l:hm.keySet()) {
                if(isOnLine(p,l)){
                    hm.put(l,hm.get(l)+1);
                    onLine=true;
                }
            }
            if(!onLine){
                for (Point q:list) {
                    CreateLine(p,q);
                }
            }
            list.add(p);
        }
        int max = Integer.MIN_VALUE;
        for (Integer i: hm.values()) {
            max = Math.max(max,i);
        }
        return max;
    }
    public static void CreateLine(Point a,Point b){
        Line l = new Line();

        if(a.x==b.x){
            l.m=null;
            l.c=(float)a.x;
        }
        else {
            l.m = (float)(a.y - b.y)/(a.x-b.x);
            l.c = (a.y - l.m*a.x);
        }


        hm.put(l,2);
    }
    public static boolean isOnLine(Point p, Line l){
        if(l.m==null)   return p.x==l.c;
        return p.y==(l.m*p.x)+l.c;
//        return l.m==p.y/p.x;
    }

    public static int maxPoints1(int[][] points){
        if(points.length<3) return points.length;
        int max=0;
        for(int[] x:points){
            HashMap<Double,Integer> map = new HashMap<>();
            for (int[] y:points) {
                if(x==y)    continue;
                double slope = 0;
                if(y[0]-x[0]==0) slope=Double.POSITIVE_INFINITY;
                else slope=(y[1]-x[1])/(double)(y[0]-x[0]);
                map.put(slope,map.getOrDefault(slope,0)+1);
                max=Math.max(max,map.getOrDefault(slope,0)+1);
            }
        }
        return max;
    }

}
