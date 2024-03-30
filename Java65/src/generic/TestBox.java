package generic;

public class TestBox {
	public static void main(String[] args) {
		Box box = new Box(15);
		System.out.println("Giá trị: "+box.getValue());
		
//		Box box = new Box(15.5);
//		Box box= new Box("Nhó lắm" ); ==>báo lỗi, không linh hoạt
	}
}
