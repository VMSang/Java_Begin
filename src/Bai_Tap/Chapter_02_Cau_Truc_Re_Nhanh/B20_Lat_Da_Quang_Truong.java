package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B20_Lat_Da_Quang_Truong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m, a;
        n = sc.nextLong();
        m = sc.nextLong();
        a = sc.nextLong();

        long doc, ngang;
        if (n % a == 0) {
            doc = n / a;
        } else {
            doc = n / a + 1;
        }
        if (m % a == 0) {
            ngang = m / a;
        } else {
            ngang = m / a + 1;
        }
        System.out.println(doc * ngang);
    }
}
