package lab01;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("bai tap 2");
        Scanner scanner = new Scanner(System.in);

        double chieudai = scanner.nextFloat();
        double chieurong = scanner.nextFloat();
        System.out.println("chu vi hinh chu nhat la: " + (chieudai + chieurong) * 2);
        System.out.println("chu vi hinh chu nhat la: " + (chieudai * chieurong));
        scanner.close();
    }
}
