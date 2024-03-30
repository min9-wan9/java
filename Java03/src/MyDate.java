
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	// contructor
	public MyDate(int d, int m, int y) {
		this.day= d;
		this.month= m;
		this.year = y;
	}
	
	
	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public void printDay() {
		System.out.println("Day:  "+ this.day );
	}
	public void printMonth() {
		System.out.println("Month: "+this.month);
	}
	public void printfYear() {
		System.out.println("Year: "+ this.year);
	}
	public void printDate() {
		System.out.println("Date: "+this.day+"-  "+this.month+"-"+this.year);
	}
}
