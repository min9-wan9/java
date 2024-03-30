package xuLiChuoi;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String s= "  Xin chào, mình là Quang, Xin chào mọi người";
		
		
		String s2= " Xin chào";
		
		System.out.println("Độ dài chuỗi 1: "+s.length());
		System.out.println("Lấy kí tự thứ 3 của chuỗi 1: "+s.charAt(3));
		
		System.out.println("so sánh giống nhau chuỗi 2 với chuỗi 1: "+s.equals(s2));
		System.out.println("so sánh giống nhau không phân biệt chữ hoa chữ thương: "+s.equalsIgnoreCase(s2));
		System.out.println("\n");
		
		System.out.println("so sánh comparable to: "+s.compareTo(s2));
		System.out.println("so sánh comparableIgnore: "+s.compareToIgnoreCase(s2));
		
		System.out.println("tìm kiếm ở chuỗi 2 trong chuỗi 1: "+s.indexOf(s2));
		System.out.println("tìm kiếm chuỗi 2 trong chuỗi 1: "+s.indexOf(s2,6));
		System.out.println("tìm kiếm từ cuỗi chuỗi 2 trong chuỗi 1: "+s.lastIndexOf(s2));
		
		// nối chuỗi: concat
		String s3= s.concat(s2);
		System.out.println("Nối chuỗi 1 với chuỗi 2: "+s3);
		// replace thay thế
		String s4=s.replaceAll(s2, "Hello");
		System.out.println("thay thế trong chuối 2 trong chuỗi 1 bằng Hello:"+s4);
		//toUpper, toLower
		String s5= s.toLowerCase();
		String s6= s.toUpperCase();
		System.out.println("ToLower: "+s5);
		System.out.println("ToUpper: "+s6);
		
		//trim: xoa dấu trăng thừa ở đầu và cuối chuỗi
		String s7=s.trim();
		System.out.println("Xóa dấu cách thừa ở đầu và cuối chuỗi: "+s7);
		// SubString: cắt chuỗi con
		String s8 = s.substring(5);
		System.out.println("chuỗi 1 sau khi cắt từ vị trí thứ 5: "+s8);
		
		
		
		
		
		
		
	}
}
