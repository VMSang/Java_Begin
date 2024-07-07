package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B14_Tong_Lap_Phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }

        System.out.println(sum);
//        System.out.println((int) (Math.pow((n * (n + 1) / 2), 2)));
    }
}
