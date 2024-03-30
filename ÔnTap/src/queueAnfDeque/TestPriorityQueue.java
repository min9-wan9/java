package queueAnfDeque;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSach = new PriorityQueue<String>();
		
		danhSach.offer("Ngô Văn Minh");
		danhSach.offer("Đặng Minh Quang");
		
		danhSach.offer("Lê Thị Lợi");
		danhSach.offer("Trịnh Văn A");
		while(true) {
			String ten = danhSach.poll();
			if(ten== null) break;
			else System.out.println(ten);
		}
	}
}
