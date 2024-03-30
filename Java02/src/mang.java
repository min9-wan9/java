import java.util.Scanner;

public class mang {
	public static void main(String[] args) {
		double mang1[];
		int mang2[];
		mang1= new double [10];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<mang1.length; i++) {
			System.out.println("nhap gia tri phan tu thu "+i+": ");
			mang1[i]= sc.nextDouble();
			
			
		}
		int tong =0;
		for(int i=0;i<mang1.length; i++) {
			tong+=mang1[i];
		}
		System.out.println(tong);
		
		System.out.println("mang 2");
		
		mang2 = new int []{1,2,3};
		for(int i=0;i<mang2.length;i++) {
			System.out.println(mang2[i]);
		}
		
	}
}
