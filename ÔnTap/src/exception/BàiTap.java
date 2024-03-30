package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BàiTap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int cout=0;
		while(cout==0) {
			
			System.out.println("Nhập chuỗi:");
			String tmp= sc.next();
			if(tmp.length() <=10) {
				s=tmp;
				cout++;
			}else {
				System.out.println("Check. Nhập lại chuỗi có độ dài nhỏ hơn 10!");
			}
		}
		Integer x= null;
		while(x==null) {
			try {
				System.out.println("Nhập x:");
				x= sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Vui lòng nhập số tự nhiên!");
			}
			finally {
				sc.nextLine();
			}
		}
				
			
		
	
	}
}
