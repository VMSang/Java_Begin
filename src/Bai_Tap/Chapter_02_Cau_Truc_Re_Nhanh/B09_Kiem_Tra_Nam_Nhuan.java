package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B09_Kiem_Tra_Nam_Nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
