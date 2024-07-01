package  Ly_Thuyet;

import java.util.Scanner;

public class Ly_Thuyet_01 {
    public static void main(String[] args) {
        long a = 16654654891516L;
        float b = 3.14651F;
        double c = 54.645611561;
        System.out.println("gia tri cua b la " + a + " " + b);
        System.out.printf("gia tri lay chu so thap phan: %.2f %.10f\n", b, c);
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        sc.nextLine();
        float e = sc.nextFloat();
        sc.nextLine();
        System.out.println((float)d + e);
        char kiTu = sc.nextLine().charAt(0);
        System.out.println(kiTu);
        int nguyen1 = 5;
        int nguyen2 = 2;
        float chia = (float)nguyen2 / (float)nguyen1;
        System.out.printf("%.2f", chia);
        int ane = 1000000;
        int bne = 1000000;
        long aPlusb = (long)ane * (long)bne;
        System.out.println(aPlusb);
        double canbac = 5;
        System.out.println("\ncan bac 2 cua 5 la: " + Math.sqrt(canbac) + "\n");
    }
}