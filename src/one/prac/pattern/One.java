package one.prac.pattern;

import javax.sound.midi.Soundbank;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        eight(5);
    }

    private static void four(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+" ");

            }
            System.out.println();

        }
    }
    private static void five(int n) {
        int i;
        for (i=1; i < n; i++) {
//            System.out.print(i);
            for (int j = 0; j <i; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
        for (; i >0; i--) {
//            System.out.print(i);
            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
    }
    private static void seven(int n) {
        for (int i = n; i>0 ; i--) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void six(int n) {
        for (int i = 1; i<=n ; i++) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void eight(int n) {
        for (int i = 1; i<=n ; i++) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(;j<n;j++){
                System.out.print("* ");
            }
            for(;j<n+i-1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void nine(int n) {
        for (int i = n; i>0 ; i--) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(;j<n;j++){
                System.out.print("* ");
            }
            for(;j<n+i-1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void ten(int n) {
        for (int i = 1; i<=n ; i++) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(;j<n;j++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }
    private static void eleven(int n) {
        for (int i = n; i>0 ; i--) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(;j<n;j++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }
    private static void twelve(int n) {
        for (int i = n; i>0 ; i--) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(;j<n;j++){
                System.out.print("* ");
            }

            System.out.println();

        }
        for (int i = 1; i<=n ; i++) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(;j<n;j++){
                System.out.print("* ");
            }

            System.out.println();

        }

    }
    private static void thirteen(int n) {
        for (int i = 1; i<=n ; i++) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(;j<n;j++){
                if(j==n-i || i==n)    System.out.print("* ");
                else    System.out.print("  ");
            }
            for(;j<n+i-1;j++){
                if(j==n+i-2 || i==n)    System.out.print("* ");
                else    System.out.print("  ");
            }
            System.out.println();

        }
    }
    private static void fourteen(int n) {
        for (int i = n; i>0 ; i--) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(;j<n;j++){
                if(j==n-i || i==n)    System.out.print("* ");
                else    System.out.print("  ");
            }
            for(;j<n+i-1;j++){
                if(j==n+i-2 || i==n)    System.out.print("* ");
                else    System.out.print("  ");
            }
            System.out.println();

        }
    }
    private static void fifteen(int n) {
        for (int i = 1; i<=n ; i++) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(;j<n;j++){
                if(j==n-i)    System.out.print("* ");
                else    System.out.print("  ");
            }
            for(;j<n+i-1;j++){
                if(j==n+i-2)    System.out.print("* ");
                else    System.out.print("  ");
            }
            System.out.println();

        }
        for (int i = n-1; i>0 ; i--) {
            int j ;
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(;j<n;j++){
                if(j==n-i )    System.out.print("* ");
                else    System.out.print("  ");
            }
            for(;j<n+i-1;j++){
                if(j==n+i-2 )    System.out.print("* ");
                else    System.out.print("  ");
            }
            System.out.println();

        }
    }
}
