package Queue_Deque;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQuueue {
	public static void main(String[] args) {
		Queue<String > danhSachSV = new LinkedList<String>();
		
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyễn Văn A");
		danhSachSV.offer("Nông Văn B");
		danhSachSV.offer("Nguyễn Thị Giác");
		
		while (true) {
			String ten = danhSachSV.poll();// ==> lấy ra và xóa
			// peek ==> lấy ra không xóa
			if(ten==null) break;
			System.out.println(ten);
		}
		
	}
}
