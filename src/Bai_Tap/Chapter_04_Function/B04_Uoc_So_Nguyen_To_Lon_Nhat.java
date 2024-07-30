package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B04_Uoc_So_Nguyen_To_Lon_Nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            long n = sc.nextLong();
            System.out.println(PhanTich(n));
        }
    }

    public static long PhanTich(long n) {
        long uoc = 0;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                uoc = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1)
            uoc = n;
        return uoc;
    }
}
