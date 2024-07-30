package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B10_So_Co_So_Luong_Uoc_La_So_Le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long can = (long) Math.sqrt(n);
        if (can * can == n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
