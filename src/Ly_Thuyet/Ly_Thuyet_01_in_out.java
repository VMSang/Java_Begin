package Ly_Thuyet;

import java.util.Scanner;

public class Ly_Thuyet_01_in_out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = 16654654891516L;
        float b = 3.14651F;
        double c = 54.645611561;

        System.out.println("giá trị của a là " + a);
        System.out.println("giá trị của b là " + b);
        System.out.printf("giá trị lấy chữ số thập phân: %.2f %.10f\n", b, c);


        int d = sc.nextInt();
        sc.nextLine(); // Nhập dòng mới sau khi nhập số nguyên

        float e = sc.nextFloat();
        sc.nextLine(); // Nhập dòng mới sau khi nhập số thực

        System.out.println((float) d + e);

        char kiTu = sc.nextLine().charAt(0);
        System.out.println(kiTu);
        System.out.println((char) (kiTu + 33));

        int nguyen1 = 5;
        int nguyen2 = 2;
        float chia = (float) nguyen2 / (float) nguyen1;
        System.out.printf("%.2f\n", chia);

        int ane = 1000000;
        int bne = 1000000;
        long aPlusb = (long) ane * (long) bne;
        System.out.println(aPlusb);

        double canbac = 5;
        System.out.println("\ncăn bậc 2 của 5 là: " + Math.sqrt(canbac) + "\n");
    }
}
