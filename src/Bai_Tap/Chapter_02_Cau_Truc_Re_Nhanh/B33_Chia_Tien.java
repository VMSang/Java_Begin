package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B33_Chia_Tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, n;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        n = sc.nextLong();

//        long MAX = Math.max(a, Math.max(b, c));
//        long sum = 0;
//        if (MAX - a > 0) sum += MAX - a;
//        if (MAX - b > 0) sum += MAX - b;
//        if (MAX - c > 0) sum += MAX - c;
//
//        n -= sum;
//        if ((n >= 3) && n % 3 == 0) System.out.println("YES");
//        else System.out.println("NO");

        long sum = a + b + c + n;
        if (sum % 3 == 0) {
            long res = sum / 3;
            if (res >= a && res >= b && res >= c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
