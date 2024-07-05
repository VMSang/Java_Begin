package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B07_Liet_Ke_Uoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                if (i != n / i) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        for (long i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
