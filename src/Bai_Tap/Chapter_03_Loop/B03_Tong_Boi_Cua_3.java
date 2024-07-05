package Bai_Tap.Chapter_03_Loop;

import java.util.Scanner;

public class B03_Tong_Boi_Cua_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //3 + 6 + 9 + 12 +...+n/3 * 3
        //== 3(1+2+3+...n/3)
        System.out.println(3 * (n / 3 * (n / 3 + 1) / 2));
    }
}
