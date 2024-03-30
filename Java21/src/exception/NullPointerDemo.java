package exception;

public class NullPointerDemo {
    public static void main(String[] args) {
        equalTest();
        System.out.println("Finish");
    }
    public static void equalTest() {
        try {
            String a = null;
            System.out.println("String equal 'test'" + a.equals("test"));
        } 
        catch(NullPointerException ex) {
        	System.out.println("Có lỗi");
        	throw ex;
        }
        catch (Exception e) {
        	System.out.println("Có lỗi");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
