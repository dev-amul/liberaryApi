package com.library.api.service;

import com.library.api.dto.BookDto;
import com.library.api.dto.BookResponse;

<<<<<<< HEAD
public interface BookService {
    BookDto createBook(BookDto bookDto);

    BookDto getBookById(long id);

    BookResponse getAllBooksByAuthorId(int pageNo, int pageSize, long author_id);

=======
import java.util.List;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    BookDto getBookById(long id);
    BookResponse getAllBooksByAuthorId(int pageNo, int pageSize, long author_id);
>>>>>>> 618aae9 (init)
    BookResponse getAllBooks(int pageNo, int pageSize);
}
