package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B13_Doi_Ngay_Sang_Nam_Tuan_Ngay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nam = n / 365;
        n -= nam * 365; //n%=365
        int tuan = n / 7;
        n -= tuan * 7; //n%=7
        System.out.print(nam + " ");
        System.out.print(tuan + " ");
        System.out.print(n);

    }
}
