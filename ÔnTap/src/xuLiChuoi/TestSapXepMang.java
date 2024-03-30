package xuLiChuoi;

import java.util.Arrays;

public class TestSapXepMang {
	public static int [] reverse (int [] x) {
		int [] rs = new int [x.length];
		int index=0;
		for(int i=x.length-1;i>=0;i--) {
			rs[index++]=x[i];
		}
		return rs;
		
	}
	public static void main(String[] args) {
			int [] x =new int[]{1,5,3,4};
			int []y = new int [] {42,3,1,24,5};
			Arrays.sort(x);
			// săp xếp tăng
			System.out.println(Arrays.toString(x));
			
			// điền
			Arrays.sort(y);
			Arrays.fill(y, 10);
			System.out.println("điền: "+Arrays.toString(y));
			
			// sắp xếp đi ngược
			Arrays.sort(x);
			x= TestSapXepMang.reverse(x);
			System.out.println("săp giảm dần: "+Arrays.toString(x));
	}
}
