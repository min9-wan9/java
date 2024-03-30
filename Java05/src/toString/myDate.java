package toString;

import java.util.Objects;

public class myDate {
	private int day;
	private int month;
	private int year;
	public myDate(int day, int month, int year) {
		if(day>=1 && day<=31) {
			this.day = day;
		}else {
			this.day=-1;
		}
		if(month >=1 && month <=12) {
			this.month = month;
		}else {
			this.month=-1;
		}
		if(year>=1) {
			this.year = year;
		}else {
			this.year= -1;
		}
	}
	
	
	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		if(day>=1 && day<=31) {
			this.day = day;
		}
		
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		if(month>=1 && month<=12) {
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

//	@Override
//	// toString+ ctrl + khoang trang+ enter
//	public String toString() {
//		
//		return this.day+ "/"+this.month+"/"+this.year;
//	}
	@Override
	public String toString() {
		return "myDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}



	@Override
public int hashCode() {
	final int prime =31;
	int result =1;
	result = prime *result +day;
	result = prime *result +month;
	result = prime *result + year;
	return result;
}


@Override// so sánh các hàm trong java
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	myDate other = (myDate) obj;
	return day == other.day && month == other.month && year == other.year;
}


	public static void main(String[] args) {
		myDate m= new myDate(23,9,2004);
		myDate m1= new myDate(28,7,2004);
		myDate m2= new myDate(23,9,2004);
		System.out.println(m.toString());
		System.out.println(m1.toString());
		
		System.out.println("m1 so sanh bang m2:  "+m.equals(m1));
		System.out.println("m so sanh với m2: "+m.equals(m2));
		
		System.out.println("Hashcode cua m: "+m.hashCode());
		System.out.println("Hashcode cua m1: "+m1.hashCode());
		System.out.println("Hashcode cua m2: "+m2.hashCode());
	}
	}


	
