package fibo;

import java.util.Scanner;


public class deQuy {
	public static int sum(int n) {
		if(n==0  ) return 0;
		else return n+sum(n-1);
	}
	public static void main(String[] args) {
		long t1= System.currentTimeMillis();
		Scanner sc = new Scanner (System .in);
		System.out.println("Nhập số fibo: ");
		int n= sc.nextInt()
;
		int tong= sum(n);
		System.out.println("fibo "+n+": "+tong);
		long t2= System.currentTimeMillis();
		System.out.println("thời gian chạy: "+(t2-t1));
	}
}
