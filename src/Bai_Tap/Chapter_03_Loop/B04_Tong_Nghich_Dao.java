package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B04_Tong_Nghich_Dao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("%.3f", sum);
    }
}
