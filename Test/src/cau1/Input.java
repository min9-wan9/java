package cau1;

import java.util.Scanner;

public class Input {
	int inputScannerInt() {
		Scanner sc =new Scanner(System.in);
		Integer n=null;
		while(n==null) {
			try {
				n= sc.nextInt();
			} catch (Exception e) {
				System.out.println("Vui long nhap lai so tu nhien");
			}finally {
				sc.nextLine();
			}
		}
		return n;
	}
	public String inputScannerString() {
		String n= null;
		Scanner sc = new Scanner(System.in);
		while(n==null) {
			try {
				n= sc.nextLine();
						
			} catch (Exception e) {
				System.out.println("Vui long nhap lai chuoi!");
			}
			finally {
				sc.nextLine();
			}
			
		}
		return n;
	}
}
