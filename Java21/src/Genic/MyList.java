package Genic;

import java.util.Arrays;
import java.util.Iterator;

public class MyList <X,Y>{
	private Object[] array;
	
	public MyList() {
		array = new Object [] {};
	}
	
	public void add(X input) {
		array= Arrays.copyOf(array,array.length-1);
	}
	/* 
	 * xóa đầu tiên x so sánh với input
	 * @param input - X need to be remove
	 */
	public void remove(X input) {
		for(int i=0;i<array.length ;i++) {
			if(array[i].equals(input)) {
				Object[] temp = new Object[array.length];
				System.arraycopy(array, i, temp, i, i);;
			}
		}
	}
//	public X getIndex(int index) {
		
	}


