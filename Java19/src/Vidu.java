import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s ;
		System.out.println("nhap vao chuỗi:");
		s = sc.nextLine();
		System.out.println("------");
		
		// hàm length() => lấy độ dài chuỗi
		System.out.println(s.length());
		
		
		int doDai = s.length();
		// charAt(vi trí): lấy ra kí tự ở vị trí bất kì
		for(int i=0 ;i<doDai;i++) {
			System.out.println("Vị trí  "+i+ " là: "+s.charAt(i));
			
		}
		
		// hàm getChars (vị trí bắt đầu, vt kết thúc, 
		// mảng dữ liệu, vị trí bắt đầu của mảng)
		char [] arrayChar = new char[100];
		s.getChars(2, 5, arrayChar, 0);
		for(int i=0; i<arrayChar.length ;i++) {
			System.out.println("giá trị của mảng tại "+i+"là "+arrayChar[i]);
		}
		
		// hàm getBytes => có 3 các lấy ra giá trị các kí tự thành một mảng 
		byte [] arrayByte = s.getBytes();
		for(byte b: arrayByte) {
			System.out.println(b);
		}
	}
}
