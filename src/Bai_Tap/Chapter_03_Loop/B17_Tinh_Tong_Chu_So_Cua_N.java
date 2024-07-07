package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B17_Tinh_Tong_Chu_So_Cua_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
