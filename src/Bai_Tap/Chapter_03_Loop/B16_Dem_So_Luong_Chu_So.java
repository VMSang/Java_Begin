package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B16_Dem_So_Luong_Chu_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int dem = 0;

        if (n == 0) dem++;
        while (n != 0) {
            dem++;
            n /= 10;
        }
        System.out.println(dem);
    }
}
