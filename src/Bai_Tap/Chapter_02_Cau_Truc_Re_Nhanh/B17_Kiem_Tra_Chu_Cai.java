package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B17_Kiem_Tra_Chu_Cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);

        if (Character.isUpperCase(c)) {
            System.out.println("UPPER");
        } else if (Character.isLowerCase(c)) {
            System.out.println("LOWER");
        } else if (Character.isDigit(c)) {
            System.out.println("DIGIT");
        } else {
            System.out.println("SPECIAL");
        }
    }
}
