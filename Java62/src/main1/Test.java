package main1;

import java.util.Iterator;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> stackChuoi = new Stack<String>();
		
//		stackChuoi.push("gia trị")==> đưa giá trị vào stack
//		stackChuoi.pop() ==> lấy giá trị ra, xóa khỏi stack
//		stackChuoi.peek() ==> lấy giá trị ra, nhưng không xóa khỏi stack
//		stackChuoi.clear();==> xóa tất cả các phần tử trong stack
//		stackChuoi.contains("Giá trị") ==> xác định có tồn tại trong stack hay không
// stackChuoi.size () ==> lấy ra độ dài của chuỗi
		
		//Ví dụ đảo ngược chuỗi
		System.out.println("Nhập vào chuỗi: ");
		String s =sc.nextLine();
		// TITV
		for(int i=0;i< s.length();i++) {
			 stackChuoi.push(s.charAt(i)+"");// cách nhập giá trị String
			
		}
		System.out.println("Chuỗi đảo ngược: ");
		for(int i=0;i<s.length();i++) {
			System.out.print(stackChuoi.pop());
		}
		
		// Ví dụ chuyển từ hệ thập phân sang hệ nhị phân
		Stack<Integer>  stackSoDu = new Stack<Integer>();
		System.out.println("\nNhập một số nguyên dương từ bàn phím");
		int x = sc.nextInt();
		while(x>0) {
			int soDu= x%2;
			stackSoDu.push(soDu);
			x/=2;
			
		}
		System.out.println("Số nhị phân là: ");
		int n= stackSoDu.size();
		for(int i=0;i<n;i++) {
			System.out.print(stackSoDu.pop());
		}
	}
}
