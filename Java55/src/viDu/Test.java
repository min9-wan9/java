package viDu;

import java.util.Arrays;

public class Test {
	public static int[] reverse (int []x) {
		int[] rs = new int [x.length];
		int index =0;
		for(int i=x.length-1;i>=0;i--) {
			rs[index]= x[i];
			index++;
		}
		return rs;
	}
	public static void main(String[] args) {
		int [] a = new int []{1,3,4,2,4,7,9};
		int[] b=  new int [15];
		
		// 
		System.out.println("a ban đầu: "+Arrays.toString(a));
		
		//Ham sap xếp
		Arrays.sort(a);
		System.out.println("a sau khi sap xếp: "+Arrays.toString(a));
		// Ham tim kiem
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));
	
		// Hàm điền giá trị
		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
	
		// Hàm sắp xếp giảm dần
		Arrays.sort(a);
		a= Test.reverse(a);
		System.out.println("a sau khi sắp xếp giảm dần: "+Arrays.toString(a));;
	
	
	}
	}

