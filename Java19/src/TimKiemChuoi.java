
public class TimKiemChuoi {
	public static void main(String[] args) {
		String s1= "xin chào các bạn,xin chào";
		String s2= "xin chào";
		String s3= "xin chào 123";
		char c1='o';
		
		// Hàm indexOf
		System.out.println("vị trí của s2 trong s1 là: "+s1.indexOf(s2));
		System.out.println("vị trí của s3 trong s1 là: "+s1.indexOf(s3));
		
		// Sử dụng vị trí bắt đầu
		System.out.println("Vị trí của s2 trong s1"+s1.indexOf(s2, 2));
	
		// Tìm kiếm char
		System.out.println("vị trí của c1 trong s1 là: "+s1.indexOf(c1));
		System.out.println("vị trí của c1 trong s1 là: "+s1.indexOf(c1,9));
		
		// Hàm lastIndexof =>tìm kiếm từ phải sáng trái
		System.out.println("vị trí của s2 trong s1 là: "+s1.lastIndexOf(s2));
		
	}
}
