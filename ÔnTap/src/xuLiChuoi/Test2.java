package xuLiChuoi;

import java.util.Arrays;

public class Test2 {// copy mảng
	public static void main(String[] args) {
			int []s= new int [] {1,2,3,4};
			//c1: gắn
			int [] s1= s;
			System.out.println(Arrays.toString(s));
			System.out.println(Arrays.toString(s1));
			
			// c2: hàm clone
			int [] s2= s.clone();
			s2[0]=10;
			System.out.println("copy kiểu clone hàm nguyên bản: "+Arrays.toString(s2));
			
			// System.Arrayscopy
			int []s3= new int [s.length];
			System.arraycopy(s, 0, s3, 0, s.length);
			System.out.println(Arrays.toString(s3));
			
	}
}
