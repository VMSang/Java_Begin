package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B34_Su_Hao_Phong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1, c2, c3, c4, c5;
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        c3 = sc.nextInt();
        c4 = sc.nextInt();
        c5 = sc.nextInt();

        int sum = c1 + c2 + c3 + c4 + c5;
        if (sum % 5 == 0) {
            int res = sum / 5;
            if (res != 0) System.out.println(res);
            else System.out.println("-1");
        } else System.out.println("-1");
    }
}
