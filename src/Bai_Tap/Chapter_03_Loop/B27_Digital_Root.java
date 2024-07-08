package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B27_Digital_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n >= 10) {
            long sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
