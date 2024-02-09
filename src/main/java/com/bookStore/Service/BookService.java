package com.bookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.Entities.Book;
import com.bookStore.Repo.BookRepo;

@Service
public class BookService {

	@Autowired
	BookRepo repo;
	
	public void saveBook(Book book) {
		repo.save(book);
	}
	
	public List<Book> getAllBook(){
		return repo.findAll();
	}
	
	public Book getBookById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}