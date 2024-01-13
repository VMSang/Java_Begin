package lab01;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("bai 3: tinh the tich hinh lap phuong: ");
        Scanner scanner = new Scanner(System.in);

        double chieudai = scanner.nextFloat();
        System.out.println("the tich hinh lap phuong la: "+ Math.pow(chieudai,3));
        scanner.close();
    }
}
