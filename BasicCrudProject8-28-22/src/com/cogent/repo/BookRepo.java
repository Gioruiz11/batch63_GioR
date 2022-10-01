package com.cogent.repo;

import java.util.List;
import com.cogent.bean.BookBean;

public interface BookRepo {
	public void addBook(BookBean bookBean);
	public void deleteBookById(int bookId);
	public BookBean findBookById(int bookId);
	public BookBean findBookByAuthor(String author);
	public List<BookBean> findBookWithPriceRange(double minPrice, double maxPrice);
}
