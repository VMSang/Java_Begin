package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B18_Chuyen_Doi_In_Hoa_In_Thuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
            if (c <= 'Z') {
                System.out.println((char) (c + 32));
            } else {
                System.out.println((char) (c - 32));
            }
        } else {
            System.out.println(c);
        }
    }
}
