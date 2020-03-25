package br.com.danillo.libraryapi.model.repository;

import br.com.danillo.libraryapi.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}