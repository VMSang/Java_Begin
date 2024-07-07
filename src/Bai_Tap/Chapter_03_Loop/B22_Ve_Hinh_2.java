package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B22_Ve_Hinh_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //hinh 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //hinh 2
        for (int i = 1; i <= n; i++) {
            for (int j = n; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
