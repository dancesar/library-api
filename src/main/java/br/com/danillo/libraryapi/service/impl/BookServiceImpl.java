package br.com.danillo.libraryapi.service.impl;

import br.com.danillo.libraryapi.model.entity.Book;
import br.com.danillo.libraryapi.model.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements br.com.danillo.libraryapi.service.BookService {

    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }
}
