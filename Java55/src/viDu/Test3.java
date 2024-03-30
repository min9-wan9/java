package viDu;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		String s= "Xin chao. moi người, mk là Quang";
		String []s1= s.split(" ");
		System.out.println(Arrays.toString(s1));
		
		String [] s2= s.split("\\,|\\.");
		System.out.println(Arrays.toString(s2));
	}
}
