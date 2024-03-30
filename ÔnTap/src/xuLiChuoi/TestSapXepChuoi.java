package xuLiChuoi;

import java.util.Arrays;


public class TestSapXepChuoi {
	public static void main(String[] args) {
		SinhVien sv1= new SinhVien("Nguyen Van A",9,123);
		SinhVien sv2= new SinhVien("Nguyên Xuan Phuc",9,123);
		SinhVien sv3= new SinhVien("Nguyen Huệ",9,123);
		SinhVien sv4= new SinhVien("Quang Trung",9,123);
		
		SinhVien [] sv_a = new SinhVien [] {sv1,sv2,sv3,sv4};
		System.out.println("Trước khi sắp xếp:"+Arrays.toString(sv_a));
		
	 
		Arrays.sort(sv_a);	
		System.out.println("Sau khi sắp xếp: "+Arrays.toString(sv_a));
				
		// Tìm kiếm
		System.out.println("Tìm Phuc trong chuối: "+Arrays.binarySearch(sv_a, sv2));
	}
}
