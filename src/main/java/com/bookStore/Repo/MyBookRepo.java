package com.bookStore.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.Entities.MyBookList;

@Repository
public interface MyBookRepo extends JpaRepository<MyBookList, Integer>{

}
