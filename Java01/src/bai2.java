import java.util.Scanner;
// kiem tra so ngay trong thang
public class bai2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Nhap vao tháng: ");
	int n = sc.nextInt();
	int nam = sc.nextInt();
	switch (n) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case  12:{
		
	System.out.println("Có 31 ngày");
	break;
	}
	case 4:
	case 6:
	case 11:{
		System.out.println("co 30 ngay");
		break;
	}
	case 2:{
		if(nam %4==0 && nam %100!=0 || (nam %400==0)) {
			System.out.println("co 29 ngay");
		}
		else System.out.println("co 28 ngay");
		break;
	}
		
	default:{
		System.out.println("nhap du lieu sai");
	}
	}
}
}


