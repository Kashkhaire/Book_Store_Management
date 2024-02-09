package com.bookStore.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.Entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
