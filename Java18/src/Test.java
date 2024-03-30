
public class Test {
	public static void main(String[] args) {
		MayTinhBoTui vn500 = new MayTinhVinacal500();
		
		SapXep sxchen = new SapXepChen() ;
		PhanMemMayTinh pm1 = new PhanMemMayTinh();
		double [] arr= new double [] {1,2,5,2,1};
		pm1.sapXepGiam(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		pm1.sapXepTang(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("5+3= "+pm1.cong(5, 3));
		
	}
}
