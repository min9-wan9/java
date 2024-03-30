import java.util.Scanner;
// chuyen tu he thap phan sang he nhi phan
public class bai4 {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("nhap so nguye n >0:");
	n = sc.nextInt();
	String nhiPhan ="";
	/* 
	 * chi lien tuc cho 2 va lay phan du
	 * dao nguoc chuoi ==> ket qua
	 * 
	 * 10:2=5 du 0
	 * 5:2=2 du 1
	 * 2:2 =1 du 0
	 * 1 :2=0 du 1
	 * 1010
	 */
	while (n>0){
		nhiPhan=(n%2)+nhiPhan;
		n/=2;
	}
	System.out.println("So he nhi phan: "+nhiPhan);
}
}
