package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B13_Tong_Le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += ((2 * i) - 1);
        }
        System.out.println(sum);
    }
}
