package Baitap;

import java.util.Scanner;

public class Giaiphuongtrinh {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nhập vào hệ số a :");
		int a = sc.nextInt();
		System.out.println("Nhập vào hệ số b :");
		int b = sc.nextInt();
		System.out.println("Kết quả của phương trình là: ");
		giaiphuongtrinh(a, b);
	}
	public static void giaiphuongtrinh(int a,int b) {
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình có vô số nghiệm.!");
			}else{
				System.out.println("Phương trình vô nghiệm.!");
			}
		}else {
			float x = -b/a;
			System.out.println("Phương trình có một nghiệm duy nhất :" +x);
		}
		
	}
}
