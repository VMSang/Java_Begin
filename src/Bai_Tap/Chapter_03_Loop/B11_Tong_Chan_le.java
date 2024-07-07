package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B11_Tong_Chan_le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        if (n % 2 == 0)
//            System.out.println(n / 2);
//        else
//            System.out.println((n - 1) / 2 - n);
//
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                tong += i;
            else
                tong -= i;
        }
        System.out.println(tong);
    }
}
