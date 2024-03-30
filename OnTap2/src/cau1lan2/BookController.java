package cau1lan2;

import java.util.ArrayList;
import java.util.List;

import cau1.Book;

public class BookController extends Input implements Activity,Search{
	
	private List<Book> books = new ArrayList<>();
	@Override
	public void searchByName(String name) {
		Book book = null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
				book= books.get(i);
			}
			if(book!=null) {
				System.out.println("Id: "+book.getId()+" Name: "+book.getName()+" Publishing: "+book.getPublishing());
			}else {
				System.out.println("Khong tim thay");
			}
		}
		
	}

	@Override
	public void add() {
		System.out.println("Nhap thong tin sach");
		System.out.println("Nhap id: ");
		Integer id=inputScannerInt();
		System.out.println("Nhap ten: ");
		String name= inputScannerString();
		System.out.println("Nhap nxb: ");
		String publisher = inputScannerString();
		books.add(new Book(id,name,publisher));
		
	}

	@Override
	public void edit() {
		System.out.println("Nhap thong tin sach");
		System.out.println("Nhap id: ");
		Integer id=inputScannerInt();
		Book book = null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getId().equals(id)) {
				book= books.get(i);
			}
		}
		if(book!= null) {
			System.out.println("Nhap ten: ");
		String name= inputScannerString();
		book.setName(name);
		System.out.println("Nhap nxb: ");
		String publisher = inputScannerString();
		book.setPublishing(publisher);
		}else {
			System.out.println("Khong trung ma");
		}
		
		
		
	}

	@Override
	public void remove() {
		
		System.out.println("Nhap id: ");
		Integer id=inputScannerInt();
		Book book = null;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getId().equals(id)) {
				book= books.get(i);
			}
		}
		if(book!= null) {
			books.remove(book);
		}else {
			System.out.println("Khong trung ma");
		}
		
		
	}
	public void menu() {
		Integer luaChon=null;
		do {
			System.out.println("--------"
					+ "Menu:\n"
					+ " 1: Thêm\r\n"
					+ " 2: Sửa \r\n"
					+ " 3: Xoá\r\n"
					+ " 4: Tìm kiếm\r\n"
					+ " 5: Thoát");
			luaChon=inputScannerInt();
			if(luaChon==1) {
				add();
			}else if(luaChon==2) {
				edit();
			}else if(luaChon==3) {
				remove();
			}else if(luaChon==4) {
				System.out.println("Nhap ten: ");
				String name= inputScannerString();
				searchByName(name);
			}
		}while(luaChon!=5);
	}
	

}
