package br.com.danillo.libraryapi.service;

import br.com.danillo.libraryapi.model.entity.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class BookServiceTest {
    BookService service;

    @Test
    @DisplayName("Deve salvar um livro")
    public void saveBookTest() {
        //cenario
        Book book = Book.builder().isbn("123").author("Fulano").title("As Aventuras").build();

        //execucao
        Book savedBook = service.save(book);

        //vereficacao
        assertThat(savedBook.getId()).isNotNull();
        assertThat(savedBook.getIsbn()).isEqualTo("123");
        assertThat(savedBook.getAuthor()).isEqualTo("Fulano");
        assertThat(savedBook.getTitle()).isEqualTo("As Aventuras");
    }
}