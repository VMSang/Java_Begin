package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B06_Tong_Uoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        System.out.println(sum);
    }
}
