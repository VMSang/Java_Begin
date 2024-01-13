package lab02;

import java.util.Scanner;

public class bai02lab02 {
	public static void ptBacNhat(float a, float b) {
		if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			float x = -b / a;
			System.out.println("nghiem cua phuong trinh la: " + x);
		}
	}

	public static void main(String[] args) {
		System.out.println("bai 2 lab 2");
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		if (a == 0) {
			System.out.println("phuong trinh bac mot");
			ptBacNhat(b, c);
		}
		float delta = b * b - (4 * a * c);
		if (a != 0) {
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("phuong trinh co nghiem kep x1 =x2 =" + -b / 2.0 * a);
			} else {
				System.out.println("phuong trinh co hai nghiem phan biet la: ");
				double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
				System.out.printf("x1=%.3f va x2=%.3f", x1, x2);

			}
		}

		scanner.close();
	}
}
