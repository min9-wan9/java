package Queue_Deque;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPrioityQueue {
	public static void main(String[] args) {
		Queue<String > danhSachSV = new PriorityQueue<String>();
		
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nông Văn B");
		danhSachSV.offer("Nguyễn Văn A");
	
		danhSachSV.offer("Nguyễn Thị Giác");
		
		while (true) {
			String ten = danhSachSV.poll();// ==> lấy ra và xóa
			// peek ==> lấy ra không xóa
			if(ten==null) break;
			System.out.println(ten);
		}
		
	}
}
