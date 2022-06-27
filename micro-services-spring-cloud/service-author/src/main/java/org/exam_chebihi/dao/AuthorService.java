package org.exam_chebihi.dao;

import org.exam_chebihi.entities.Author;
import org.exam_chebihi.entities.BooksItem;
import org.exam_chebihi.model.Book;
import org.exam_chebihi.web.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    final BookItemsRepository bookItemsRepository;
    final BookClient bookClient;
    final AuthorRepository authorRepository;

    public AuthorService(BookItemsRepository bookItemsRepository, BookClient bookClient, AuthorRepository authorRepository) {
        this.bookItemsRepository = bookItemsRepository;
        this.bookClient = bookClient;
        this.authorRepository = authorRepository;
    }

    public Author getBooks(Integer id)
    {
        Optional<Author> author = authorRepository.findById(id);
        if(author.isPresent()){
            List<Book> book = bookClient.findBooksByAuthor(id);

            Author author1 = author.get();
            author1.setBooks(book);
            return author1;
        }
        return null;
    }
}
