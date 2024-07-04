package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B23_Doremon_Leo_Cau_Thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int min, max = n;

        if (n % 2 == 0) {
            min = n / 2;
        } else {
            min = n / 2 + 1;
        }

        if (min <= max) {
            System.out.println(((min + m - 1) / m) * m);
        } else {
            System.out.println("-1");
        }
    }
}
