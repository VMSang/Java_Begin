package Bai_Tap.Chapter_04_Function;

import java.util.Scanner;

public class B02_Sphenic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(phantich(n) ? "1" : "0");
    }

    public static boolean phantich(long n) {
        long cntTSNV = 0;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long cntMu = 0;
                while (n % i == 0) {
                    cntMu++;
                    n /= i;
                }
                if (cntMu > 1) return false;
                cntTSNV++;
            }
        }
        if (n > 1)
            cntTSNV++;
        return cntTSNV == 3;
    }
}
