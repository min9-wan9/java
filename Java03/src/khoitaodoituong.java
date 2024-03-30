
public class khoitaodoituong {
	public int x = 0;
	public int y = 0;
	
	// A contructor
	public khoitaodoituong( int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args) {
		khoitaodoituong originone = new khoitaodoituong(23,94);
	}
}
/* có thể sử dụng đối tượng theo 2 cách:
 * tham chiếu tới các thuộc tính 
 *   objectRefence.variableName;
 *   ví dụ: sysout("chiều cao của recOne: "+ recOne.height);
 *triệu gọi các phương thức
 *  objectReference.mehtodName 
 *    ví dụ: sysout(""dien tich của recOne: "+recone.area);
*/