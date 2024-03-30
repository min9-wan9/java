package queueAnfDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestQueue {
	// first in, first out
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> so = new LinkedList<String>();
		System.out.println("Nhập vào chuỗi: ");
		String s= sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			
			so.offer(s.charAt(i)+"");
		}
		while (so.size()>0) {
			String tmp= so.poll();
			System.out.print(tmp);
		}
	}
}
