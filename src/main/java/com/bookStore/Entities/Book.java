package com.bookStore.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	@NotBlank(message = "Name cannot be Blank")
	private String Name;
	
	@Column
	private String Author;
	
	@Column
	private String Prize;

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
		return Prize;
	}

	public void setPrize(String prize) {
		Prize = prize;
	}

	public Book(int id, @NotBlank(message = "Name cannot be Blank") String name, String author, String prize) {
		super();
		this.id = id;
		Name = name;
		Author = author;
		Prize = prize;
	}

	public Book() {
		super();
	}
	
}
