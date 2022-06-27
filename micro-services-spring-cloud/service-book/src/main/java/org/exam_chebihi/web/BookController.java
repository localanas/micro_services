package org.exam_chebihi.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.exam_chebihi.dao.BookRepository;
import org.exam_chebihi.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//@RefreshScope
@RestController
public class BookController {

    @Autowired
    public BookRepository bookRepository;
    @GetMapping("books/findBy/{author_id}")
    public List<Book> getBooksByAuthorId(@PathVariable("author_id") int author_id)
    {
         List<Book> books = bookRepository.findAll();
          List<Book> booksByAuthor =  books.stream()
                 .filter(b -> b.getAuthor_id() == author_id)
         .collect(Collectors.toList());

         return booksByAuthor;
    }

}
