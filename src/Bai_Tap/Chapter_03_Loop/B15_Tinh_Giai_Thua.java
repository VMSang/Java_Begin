package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B15_Tinh_Giai_Thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println(giaiThua);
    }
}
