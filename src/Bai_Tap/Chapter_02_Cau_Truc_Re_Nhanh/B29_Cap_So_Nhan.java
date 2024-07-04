package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B29_Cap_So_Nhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, d;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();

        if (a % b == 0) {
            long congboi = a / b;
            if (b * congboi == c && c * congboi == d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
