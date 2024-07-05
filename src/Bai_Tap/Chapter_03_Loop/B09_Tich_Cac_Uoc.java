package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B09_Tich_Cac_Uoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mul = 1;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                mul *= i;
                if (i != n / i) {
                    mul *= n / i;
                }
            }
        }
        System.out.println(mul);
    }
}
