package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B10_Tam_Giac_Hop_Le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        if ((a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c) > a)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
