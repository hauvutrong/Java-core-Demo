package Baitap;
import java.util.Scanner;

public class Giaiphuongtrinhbac2 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Nhập vào hệ số a :");
		int a = sc.nextInt();
		System.out.println("Nhập vào hệ số b :");
		int b = sc.nextInt();
		System.out.println("Nhập vào hệ số c :");
		int c = sc.nextInt();
		System.out.println("Kết quả của phương trình là : ");
		giaiphuongtrinhb2(a, b, c);
	}

	public static void giaiphuongtrinhb2(int a, int b, int c) {
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm!");
				} else {
					System.out.println("Phương trình vô nghiệm!");
				}
			} else {
				System.out.println("Phương trình có một nghiệm duy nhất là :" + (-c / b));
			}
			return;
		}

		double delta = (b * b) - (4 * a * c);
		double x1, x2;
		if (delta > 0) {
			x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
			x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
			System.out.println("Phương trình có 2 nghiệm là :" + x1 + " ; " + x2);
		} else if (delta == 0) {
			x1 = x2 = -b / 2 * a;
			System.out.println("Phương trình có 1 nghiệm kép là : " + "x = " + x1);
		} else {
			System.out.println("Phương trình vô nghiệm");
		}

	}
}
