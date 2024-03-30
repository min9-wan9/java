package Queue_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequedemo {
	public static void main(String[] args) {
		Deque<String> danhSachSv = new ArrayDeque<String>();
		danhSachSv.offer("Đăng Minh Quang");
		danhSachSv.offer("Nguyễn Văn A");
		danhSachSv.offer("Lê Văn Lợi");
		danhSachSv.offerFirst("Lê Văn Đầu");
		danhSachSv.offerLast("Nguyễn Văn Cuối");
		
		while(true) {
			if(danhSachSv.size()>0) {
				String ten =danhSachSv.poll();
				System.out.println(ten);
			}else break;
			
		}
	}
}
