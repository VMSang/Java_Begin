package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B15_Mua_Nuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, a, b;
        n = sc.nextLong();
        a = sc.nextLong();
        b = sc.nextLong();

        if (b > a + a) {
            b = a + a;
        }
        long sum = n / 2 * b;
        sum += n % 2 * a;
        System.out.println(sum);
    }
}
