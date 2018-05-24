package Baitap;

import java.util.Scanner;

public class TimBSCLNvaUSCLN {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập vào số nguyên dương a =");
		int a = sc.nextInt();
		System.out.println("Nhập vào số nguyên dương b =");
		int b =sc.nextInt();
		// tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
	}
	public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
     
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
