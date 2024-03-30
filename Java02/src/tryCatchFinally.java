import java.util.Scanner;

public class tryCatchFinally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {

			System.out.println("nhap vao so nguye n:");
			n = sc.nextInt();
		} catch (Exception e) {
			// nếu bị lỗi mới thực hiện
			System.out.println("Nhap du lieu ko dung");
		} finally {
			// luon thuc hien du co ngoai le khong
			System.out.println("Finally");
		}

		System.out.println("gia tri nhap: " + n);
		System.out.println("gia tri ket thuc: " + n);
	}
}
