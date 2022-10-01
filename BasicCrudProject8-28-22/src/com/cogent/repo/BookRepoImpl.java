package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

public class BookRepoImpl implements BookRepo{

	List<BookBean> bookBeanArray = new ArrayList<>();
	
	@Override
	public void addBook(BookBean bookBean) {
		bookBeanArray.add(bookBean);
		
	}

	@Override
	public void deleteBookById(int bookId) {
		for(int i = 0; i < bookBeanArray.size(); i++) {
			if(bookBeanArray.get(i).getBookId() == bookId) {
				bookBeanArray.remove(i);
			}
		}
		
	}

	@Override
	public BookBean findBookById(int bookId) {
		for(BookBean b : bookBeanArray) {
			if(b.getBookId() == bookId) {
				System.out.println("Book found");
				return b;
			}
		}
		System.out.println("Book not found");
		return null;
	}

	@Override
	public BookBean findBookByAuthor(String author) {
		for(BookBean b : bookBeanArray) {
			if(b.getBookAuthor().equals(author)) {
				return b;
			}
		}
		return null;
	}

	@Override
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice) {
		List<BookBean> newBookBeanArray = new ArrayList<>();
		for(BookBean b : bookBeanArray) {
			if(b.getPrice() > minPrice && b.getPrice() < maxPrice) {
				newBookBeanArray.add(b);
			}
		}
		return newBookBeanArray;
	}

}
