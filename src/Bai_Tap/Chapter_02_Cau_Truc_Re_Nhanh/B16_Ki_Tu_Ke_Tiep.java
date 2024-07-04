package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B16_Ki_Tu_Ke_Tiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if (c == 'Z' || c == 'z') {
            System.out.println('a');
        } else if (c >= 'a' && c < 'z') {
            System.out.println((char) (c + 1));
        } else {
            System.out.println((char) (c + 33));
        }
    }
}
