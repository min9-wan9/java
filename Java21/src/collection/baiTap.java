package collection;

public class baiTap {
	public static void main(String[] args) {
		int [] a = new int[] {1,3,6,2,4,10,99,88,1,6,2,88};
		int []b=  new int [12] ;
		
		int tmp=0;
		for(int i=0;i<a.length;i++) {
			int gan=0;
			for(int j=0;j<=i;j++) {
				if(b[j]==a[i]) {
					gan++;
				
				}
				
			}
			if(gan== 0) {
				b[tmp] =a[i];
				tmp++;
			}
		}
		for(int i=0;i<tmp;i++) {
			System.out.print(b[i] +" ");
		}
		
	}
}
