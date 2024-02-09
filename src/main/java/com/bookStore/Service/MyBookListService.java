package com.bookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.Entities.MyBookList;
import com.bookStore.Repo.MyBookRepo;

@Service
public class MyBookListService {
	
	@Autowired
	MyBookRepo mybookrepo;
	
	public void saveMyBooks(MyBookList book) {
		mybookrepo.save(book);
	}

	public List<MyBookList> getAllMyBooks(){
		return mybookrepo.findAll();
	}
	
	public void deleteById(int id) {
		mybookrepo.deleteById(id);
	}
}
