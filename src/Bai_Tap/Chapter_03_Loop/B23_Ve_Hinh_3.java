package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B23_Ve_Hinh_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //hinh 1
        for (int i = 1; i <= n; i++) {
            int start = i * n - (n - 1);
            for (int j = 1; j <= n; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }

        System.out.println();
        //hinh 2
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for (int j = 1; j < n; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

        System.out.println();
        //hinh 3
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--)
                System.out.print("~");
            for (int k = 1; k <= i; k++)
                System.out.print(i);
            System.out.println();
        }

        System.out.println();
        //hinh 4
        for (int i = 1; i <= n; i++) {
            int kc = n - 1;
            int start = i;
            System.out.print(start + " ");
            for (int j = 1; j < i; j++) {
                start += kc;
                System.out.print(start + " ");
                kc--;
            }
            System.out.println();
        }
    }
}
