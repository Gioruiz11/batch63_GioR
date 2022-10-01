package com.cogent.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cogent.bean.BookBean;
import com.cogent.service.BookServiceImpl;

public class BookLibrary {

	public static void main(String[] args) {
		BookServiceImpl bookService = new BookServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("************************");
			System.out.println("1. add book");
			System.out.println("2. delete book by id");
			System.out.println("3. find book by id");
			System.out.println("4. find book by author");
			System.out.println("5. find books within price range");
			System.out.println("6. exit");
			System.out.println("************************");
			
			System.out.println("Type your option");
			int input = scanner.nextInt();
			scanner.nextLine();
			switch(input) {
			case 1:
				System.out.println("Type the books id: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Type the books Title: ");
				String title = scanner.nextLine();
				System.out.println("Type the books Author: ");
				String author = scanner.nextLine();
				System.out.println("Type the books price: ");
				double price = scanner.nextDouble();
				scanner.nextLine();
				BookBean newBook = new BookBean(id, title, author, price);
				bookService.addBook(newBook);
				break;
				
			case 2:
				System.out.println("Type the books id to delete: ");
				int deleteById = scanner.nextInt();
				scanner.nextLine();
				bookService.deleteBookById(deleteById);
				break;
				
			case 3:
				System.out.println("Type the books id to find: ");
				int findById = scanner.nextInt();
				scanner.nextLine();
				BookBean foundBook = bookService.findBookById(findById);
				System.out.println("id: " + foundBook.getBookId() + " title: " + foundBook.getBookTitle() +
						" author: " + foundBook.getBookAuthor() + " price: " + foundBook.getPrice());
				break;
				
			case 4:
				System.out.println("Type the books author to find: ");
				String authorSearch = scanner.nextLine();
				BookBean foundBookAuthor = bookService.findBookByAuthor(authorSearch);
				System.out.println("id: " + foundBookAuthor.getBookId() + " title: " + foundBookAuthor.getBookTitle() +
						" author: " + foundBookAuthor.getBookAuthor() + " price: " + foundBookAuthor.getPrice());
				break;
				
			case 5:
				System.out.println("Type the minimum price: ");
				int min = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Type the maximum price: ");
				int max = scanner.nextInt();
				scanner.nextLine();
				List<BookBean> listOfBooks = bookService.findBookWithPriceRange(min, max);
				for(BookBean book : listOfBooks) {
					System.out.println("id: " + book.getBookId() + " title: " + book.getBookTitle() +
					" author: " + book.getBookAuthor() + " price: " + book.getPrice() + "\n");
				}
				break;
				
			case 6:
				System.out.println("Program ending");
				System.exit(0);
				
			default:
				System.out.println("Type a correct option...");
				//break;
			}
			
		}
	}

}
