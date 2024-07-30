package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B03_Phan_Tich_Thua_So_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        PhanTich(n);
    }

    public static void PhanTich(long n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != 2) {
                    System.out.print(" * ");
                }
                System.out.print(i + "^");
                long cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                System.out.print(cnt);
            }
        }
        if (n > 1)
            System.out.print(" * " + n + "^1");
    }
}