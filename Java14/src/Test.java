
public class Test {
	public static void main(String[] args) {
		MyMath mm= new MyMath();
		System.out.println("min(5,5)= "+mm.timMin(5,5));
		System.out.println("min(3.4, 9.2)="+mm.timMin(3.4, 9.2));
		System.out.println("tong(5,6)="+mm.tinhTong(5.0, 6.0));
	
		double arr[] = new double [] {1,2,3,4,5};
		System.out.println("ting tong(arr): "+mm.tinhTong(arr));
	
	
	}
}
