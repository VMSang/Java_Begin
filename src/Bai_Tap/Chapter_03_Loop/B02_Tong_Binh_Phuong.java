package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B02_Tong_Binh_Phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((n * (n + 1) * (2 * n + 1)) / 6);
    }
}
