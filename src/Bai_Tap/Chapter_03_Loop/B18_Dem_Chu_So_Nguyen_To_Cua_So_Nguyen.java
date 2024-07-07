package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B18_Dem_Chu_So_Nguyen_To_Cua_So_Nguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        while (n != 0) {
            long digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7)
                cnt++;
            n /= 10;
        }
        System.out.println(cnt);
    }
}
