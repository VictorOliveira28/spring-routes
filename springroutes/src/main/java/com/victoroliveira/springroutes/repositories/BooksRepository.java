package com.victoroliveira.springroutes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victoroliveira.springroutes.entities.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>{

}
