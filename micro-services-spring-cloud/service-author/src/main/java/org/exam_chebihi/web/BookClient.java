package org.exam_chebihi.web;

import org.exam_chebihi.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="book-service")
public interface BookClient {

    @GetMapping("books/findBy/{author_id}")
    List<Book> findBooksByAuthor(@PathVariable("author_id") int author_id);

}
