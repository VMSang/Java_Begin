package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B07_So_Chinh_Phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long check = (long) Math.sqrt(n);
        System.out.println((check * check == n) ? "YES" : "NO");
    }
}
