package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B12_So_Thuan_Nghich_Co_3_Uoc_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        int check = 0;
        for (long i = a; i <= b; i++) {
            if (thuanNghich(i) && phanTich(i) >= 3) {
                System.out.println(i + " ");
                check = 1;
            }
        }
        if (check == 0)
            System.out.println(-1);
    }

    public static boolean thuanNghich(long n) {
        long orn = n;
        long lat = 0;
        while (n != 0) {
            lat = lat * 10 + n % 10;
            n /= 10;
        }
        return n == orn;
    }

    public static long phanTich(long n) {
        long cnt = 0;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return cnt;
    }
}
