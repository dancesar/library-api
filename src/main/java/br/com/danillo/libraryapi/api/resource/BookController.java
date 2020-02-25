package br.com.danillo.libraryapi.api.resource;

import br.com.danillo.libraryapi.api.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create(){

        BookDTO dto = new BookDTO();

        dto.setId(11);
        dto.setTitle("Meu Livro");
        dto.setAuthor("Autor");
        dto.setIsbn("1234567");

        return dto;
    }
}