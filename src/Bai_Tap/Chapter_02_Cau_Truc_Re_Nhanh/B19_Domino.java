package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B19_Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();

        System.out.println((m / 2) * n + (m % 2) * n / 2);
    }
}
