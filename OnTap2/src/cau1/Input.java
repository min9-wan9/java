package cau1;

import java.util.Scanner;

public class Input {
	Scanner sc = new Scanner(System.in);
	
	public Input() {
		
	}

	public int inputScannerInt() {
		Integer  n =null;
		while(n==null) {
			try {
			 n= sc.nextInt();
			
		} catch (Exception e) {
			System.out.println("Vui lòng nhập lại kiểu số nguyên!");
			
		}finally {
			sc.nextLine();
		}
		}
		
		return n;
	}
	
	public String inputScannerString() {
		String s=null;
		while(s==null) {
			try {
			s=sc.nextLine();
		} catch (Exception e) {
			System.out.println("Vui lòng nhập lại kiểu chuỗi!");
			
		}
			finally {
				sc.nextLine();
			}
		}
		
		return s;
	}
	
}
