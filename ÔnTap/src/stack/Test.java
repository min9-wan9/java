package stack;

import java.util.Scanner;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Stack<String> ten = new Stack<String>();
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Nhập vào chuỗi: ");
		String x= sc.nextLine();
		
		for(int i=0;i<x.length();i++) {
			ten.push(x.charAt(i)+"");
			// nhập vào stack
		}
		System.out.println("Nhập vào chuỗi a:");
		String a = sc.nextLine();
		System.out.println("Stack có chứa chuỗi a:"+ten.contains(a));
		/*
		 * peek: đưa ra màn hình mà không xóa khỏi stack
		 * clear: xóa hết dữ liệu
		 * size : số lượng hiện tại trong stack
		 * contains: có chưa trong stack không
		 */
		
		while(ten.size()>0) {
			String gan= ten.pop();// đưa ra màn hình mà xóa stack
			System.out.print(gan);
		}
		// chuyển sang hệ nhị phân
		
		Stack<Integer> soDu = new Stack<Integer>();
		System.out.println("Nhấp số: ");
		int s= sc.nextInt();
		while(s>0) {
			int gan= s%2;
			soDu.push(gan);
			s/=2;
		}
		System.out.println("Nhị phân là : ");
		while(soDu.size()>0) {
			System.out.print(soDu.pop());
		}
		
	}
}
