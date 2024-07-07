package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B12_Tong_Boi_Hai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i * 2;
        }
        System.out.println(tong);
    }
}
