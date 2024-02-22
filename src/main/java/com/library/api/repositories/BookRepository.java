package com.library.api.repositories;

import com.library.api.models.Author;
import com.library.api.models.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
public interface BookRepository extends JpaRepository<Book, Long> {
=======
import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
>>>>>>> 618aae9 (init)
    Page<Book> findBooksByAuthor(Author author, Pageable pageable);
}
