import java.util.Arrays;

public class ViDu {
	public static void main(String[] args) {
		// kiều nguyên thủy 
		int []mang1 = {1,2,3};
		
		// copy mảng cách 1
		int []mang1_a = mang1;
		mang1_a[0]= 100;
		
		System.out.println("mang 1: "+Arrays.toString(mang1));
		System.out.println("Mang1_a :"+ Arrays.toString(mang1_a));
		
		// copy kiêu clone
		int [] mang1b = mang1.clone();
		mang1b[0]=50;
		System.out.println("Mang1b: "+Arrays.toString(mang1b));
		
		// copy mang cách 3 - dùng hàm System.arraycopy
		int  [] mang1c = new int [mang1.length];
		System.arraycopy(mang1, 0, mang1c, 0, mang1.length);
		mang1c[0]=10;
		System.out.println("Mang1c: "+Arrays.toString(mang1c));
		
		
	}
}
