package Baitap;
import java.util.Scanner;

public class TinhdaysoFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bạn muỗn nhập dãy số fibonacci có bao nhiêu chữ số:");
		int x = sc.nextInt();
		System.out.println(x+"sô trong dãy số fibinacci mà bạn yêu cầu:");
		for (int i = 0; i < x; i++) {
			System.out.print(fibonacci(i));
		}
		
	}
	
	public static int fibonacci(int n) {
		int f0=0;
		int f1=1;
		int fn=1;
		if(n<0) {
			return -1;
		}else if(n==0 || n ==1) {
			return n;
		}else{
			for(int i=2;i<n;i++) {
				f0 = f1;
				f1=fn;
				fn=f0+f1;
			}
			
		}
		return fn;
	}
}
