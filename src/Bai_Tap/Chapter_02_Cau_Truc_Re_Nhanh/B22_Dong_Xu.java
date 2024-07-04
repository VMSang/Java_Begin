package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B22_Dong_Xu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, S;
        n = sc.nextInt();
        S = sc.nextInt();
        System.out.println((S + n - 1) / n);
    }
}
