package queueAnfDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
	public static void main(String[] args) {
		Deque<String> danhSach = new ArrayDeque<String>() ;
		
		danhSach.offer("Nguyễn Văn A");
		danhSach.offer("Nguyễn Văn B");
		danhSach.offer("Lê Văn Lợi");
		danhSach.offerFirst("Đặng Minh Quang");
		danhSach.offerLast("Nông Văn Dền");
		while(true) {
			String ten=danhSach.poll();
			if(ten == null) break;
			else System.out.println(ten);
		}
	}
}
