package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B15_Mua_Vo {
    public B15_Mua_Vo() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        System.out.println("SO VO MUA DUOC LA : " + n / x + " !!!!!");
    }
}
