package br.com.danillo.libraryapi.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {

    private Integer id;
    private String title;
    private String author;
    private String isbn;
}