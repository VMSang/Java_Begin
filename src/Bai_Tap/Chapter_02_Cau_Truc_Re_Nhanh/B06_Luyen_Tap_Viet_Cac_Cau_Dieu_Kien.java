package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B06_Luyen_Tap_Viet_Cac_Cau_Dieu_Kien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("YES");
        } else System.out.println("NO");

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("YES");
        } else System.out.println("NO");

        if (n % 3 == 0 && n % 7 != 0) System.out.println("YES");
        else System.out.println("NO");

        if (n % 3 == 0 || n % 7 == 0) System.out.println("YES");
        else System.out.println("NO");

        if (n > 30 && n < 50) System.out.println("YES");
        else System.out.println("NO");

        if (n > 30 && (n % 2 == 0 || n % 3 == 0 || n % 5 == 0)) System.out.println("YES");
        else System.out.println("NO");

        int tmp = n % 10;
        if (n >= 10 && n < 100 && (tmp == 2 || tmp == 3 || tmp == 5 || tmp == 7)) System.out.println("YES");
        else System.out.println("NO");

        if (n <= 100 && n % 23 == 0) System.out.println("YES");
        else System.out.println("NO");

        if (n < 10 || n > 20) System.out.println("YES");
        else System.out.println("NO");

        if (tmp % 3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
