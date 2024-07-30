package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B09_So_Chinh_Phuong_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println((long) ((Math.sqrt(b) - Math.ceil(Math.sqrt(a)) + 1)));
    }
}
