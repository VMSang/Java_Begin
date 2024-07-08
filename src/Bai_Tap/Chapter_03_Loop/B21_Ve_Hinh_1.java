package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B21_Ve_Hinh_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //xác định số dòng của hình có mối quan hệ thế nào với inp
        //xác định mỗi dòng in ra bao nhiêu kí tự
        
        //hinh 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //hinh 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) System.out.print("*");
                else {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        //hinh 3
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) System.out.print("*");
                else {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("#");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        //hinh 4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) System.out.print(i + " ");
                else {
                    if (j == 1 || j == n) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
