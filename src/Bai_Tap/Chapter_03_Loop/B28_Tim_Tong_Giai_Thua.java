package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B28_Tim_Tong_Giai_Thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
            sum += giaithua;
        }
        System.out.println(sum);
    }
}
