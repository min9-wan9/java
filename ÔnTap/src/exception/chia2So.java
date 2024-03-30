package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class chia2So {
	public static void main(String[] args) {
		nhap();
		
	}
	public static void nhap() {
		Scanner sc= new Scanner (System.in);
		Integer a=null;
		while(a==null) {
			try {
			System.out.println("Nhập số đầu tiên: ");
			a=sc.nextInt();
			
		}catch (InputMismatchException e) {
			System.out.println("Vui lòng nhập số tự nhiên!");
			
		}
		finally {
			sc.nextLine();
		}
		}
		// nhập số b
		Integer b=null;
		while(b==null) {
			
			try {
				System.out.println("Nhập số thứ 2:");
				int tmp= sc.nextInt();
				if(tmp!=0) {
					b=tmp;
				}
				else {
					System.out.println("Vui lòng nhập số khác không!");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Vui lòng nhập số tự nhiên!");
			}
			finally {
				sc.nextLine();
			}
		}
		
		// hiện thị
		try {
			int output= a/b;
			System.out.println("Kết quả a/b: "+output);
		}
		catch (ArithmeticException ex) {
			System.out.println("Không thể chia cho không");
		}
		
	}
}
