package cau1;

import java.util.ArrayList;
import java.util.List;

public class BookController extends Input implements Search,Activity{
	
	List<Book> books= new ArrayList<>();
	@Override
	public void add() {
		System.out.println("Nhập thông tin:");
		System.out.println("Nhập id:");
		int id= inputScannerInt();
		System.out.println("Nhập tên:");
		String name= inputScannerString();
		System.out.println("Nhập nxb: ");
		String publishing = inputScannerString();
		books.add(new Book(id,name,publishing));
	}

	@Override
	public void edit() {
		System.out.println("Nhập id:");
		int id= inputScannerInt();
		Book book= null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getId() ==id) {
				book= books.get(i);
			}
		}
		if(book!= null) {
			System.out.println("Nhập tên:");
			String name= inputScannerString();
			book.setName(name);
			System.out.println("Nhập nxb: ");
			String publishing = inputScannerString();
			books.add(new Book(id,name,publishing));
			book.setPublisher(publishing);
		}else {
			System.out.println("Khong trung mã ");
		}
		
	}

	@Override
	public void remove() {
		System.out.println("Nhập id:");
		int id= inputScannerInt();
		Book book= null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getId() ==id) {
				book= books.get(i);
			}
		}
		if(book!= null) {
			books.remove(book);
		}else {
			System.out.println("Khong trung mã ");
		}
		
	}

	@Override
	public void searchByName(String name) {
		Book book=null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
				
				book= books.get(i);
			}
		}
		if(book!=null) {
			System.out.println(book);
		}else {
			System.out.println("Không tìm thấy");
		}
		
	}
	public void menu() {
		Integer luaChon=null;
		do {
			System.out.println("MENU: ");
		System.out.println(" 1: Thêm\r\n"
				+ " 2: Sửa \r\n"
				+ " 3: Xoá\r\n"
				+ " 4: Tìm kiếm\r\n"
				+ " 5: Thoát");
		luaChon= inputScannerInt();
		if(luaChon==1) {
			add();
		}else if(luaChon==2) {
			edit();
		}else if(luaChon==3) {
			remove();
		}else if(luaChon==4) {
			System.out.println("Nhập tên: ");
			String name= inputScannerString();
			searchByName(name);
		}
		}while(luaChon!=5);
		
	}
}
