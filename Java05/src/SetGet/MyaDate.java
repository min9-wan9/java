package SetGet;
// thay đổi giá trị nhập vào
public class MyaDate {
	private int day;
	private int month;
	private int year;
	public MyaDate(int day, int month, int year) {
		if(day>=1 && day <=31) {
			this.day = day;
		}
		else {
			this.day= 1;
		}
		if(month >=1 && month<=12) {
			this.month = month;
		}else {
			this.month = 1;
		}
		if(year >=0) {
			this.year = year;
		}else {
			this.year=1;
		}
		
		
	}
	
	public int getDay() {
		return this.day;
	}
	public void setDay(int d) {
		if(d>=1 && d <=31 ) {
			this.day= d;
		}
	}
	

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if(month >=1 &&month <=12) {
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>=1) {
			this.year = year;
		}
		
	}

	public static void main(String[] args) {
		MyaDate md= new MyaDate(31,1,2023);
		System.out.println("Day = "+md.getDay());
		
		md.setDay(35);
		System.out.println("Day = "+md.getDay());
		
		md.setMonth(15);
		System.out.println("Month= "+md.getMonth());
		
		md.setMonth(5);
		System.out.println("Month ="+md.getMonth());
	}

	
	
}
