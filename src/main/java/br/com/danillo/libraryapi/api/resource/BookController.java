package br.com.danillo.libraryapi.api.resource;

import br.com.danillo.libraryapi.api.dto.BookDTO;
import br.com.danillo.libraryapi.model.entity.Book;
import br.com.danillo.libraryapi.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(@RequestBody BookDTO dto){

        Book entity = Book.builder()
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .isbn(dto.getIsbn())
                .build();

        entity = service.save(entity);

        return BookDTO.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .author(entity.getAuthor())
                .isbn(entity.getIsbn())
                .build();
    }
}