
public class ViduChuoi {
	public static void main(String[] args) {
		String s1= "titv.vn";
		String s2= "TITV.vn";
		String s3= "titv.vn";
		
		// Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("s1 equal s3: "+s1.equals(s3));
	
		// Hàm equalsIgnorecase => so sánh không biệt hoa thường
		System.out.println("s1 equalsIgnoreCase s2: "+s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalIgnoreCase s3: "+s1.equalsIgnoreCase(s3));
	
		// Hàm compareTo => so sánh < > =
		String sv1 = "Nguyên văn A";
		String sv2 = "Nguyên văn B";
		String sv3 = "Nguyên văn a";
		String sv4 = "Nguyên văn A";
		
		System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));
	
		// Hàm compareToIgnoreCase => tượng tự compareTo, ko biệt chữ hoa chữ thường
		System.out.println("sv1 compareIgnoreCase sv3: "+sv1.compareToIgnoreCase(sv3));
	
		// Hàm regionMatches(từ vị trí r1, r2, beginr2; số lượng kí tự so sánh) => so sánh một đoạn
		String r1= "TITV.vn";
		String r2= "TV.vn";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
		// Hàm Startwith =>Hàm kiểm tra chuỗi bắt đầu bằng ....
		String sdt = "0373421431";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("032"));
	
		//Hàm endWith => Hàm kiểm tra chỗi kết thức bằng....
		String tenFile = "I love you.IPG";
		String tenFile2= "Học Java.PDF";
		if(tenFile.endsWith("IPG")){
			System.out.println("file là 1 ảnh");
		}else if(tenFile.endsWith("PDF")) {
			System.out.println("TH2");
			
		}
		if(tenFile2.endsWith(".JPG")){
			System.out.println("file là 1 ảnh");
		}else if(tenFile2.endsWith("PDF")) {
			System.out.println("TH2");
			
		}
}
}
