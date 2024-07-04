package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B25_Doi_Tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum += n / 100;
        n %= 100;
        sum += n / 20;
        n %= 20;
        sum += n / 10;
        n %= 10;
        sum += n / 5;
        n %= 5;
        sum += n;
        System.out.println(sum);
    }
}
