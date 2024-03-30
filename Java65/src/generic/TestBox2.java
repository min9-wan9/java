package generic;

public class TestBox2 {
	public static void main(String[] args) {
		Box2 b1= new Box2<Integer>(15);
		System.out.println("Giá trị: "+b1.getValue());
	
		Box2 b3= new Box2<String>("Test");
		System.out.println("Giá tri: "+b3.getValue());
	
		Box2 b2= new Box2<Double >(23.4);
		System.out.println("Giá trị :"+b2.getValue());
	}
}
