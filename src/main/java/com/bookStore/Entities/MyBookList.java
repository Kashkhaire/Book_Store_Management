package com.bookStore.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyBooks")
public class MyBookList {
	
	public MyBookList() {
		super();
	}

	public MyBookList(int id, String name, String author, String prize) {
		super();
		this.id = id;
		Name = name;
		Author = author;
		this.prize = prize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}



	@Id
	private int id;
	
	private String Name;
	
	private String Author;
	
	private String prize;

}
