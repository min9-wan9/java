package xuLiChuoi;

public class Test3 {
	public static void main(String[] args) {
		SinhVien sv1= new SinhVien("Nguyễn Văn Minh",12,4);
		SinhVien sv2= new SinhVien("Lê Văn Lợi",23,5);
		System.out.println("So sánh mã sinh viên cua sv1 và sv2: "+sv1.compareTo(sv2));
		
	}
}
