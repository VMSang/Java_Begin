package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B13_Lon_Nhat_Nho_Nhat {
    public B13_Lon_Nhat_Nho_Nhat() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(z, t));
        System.out.println(Math.max(x, Math.max(y, z)));
        System.out.println(Math.min(x, Math.min(y, Math.min(z, t))));
    }
}
