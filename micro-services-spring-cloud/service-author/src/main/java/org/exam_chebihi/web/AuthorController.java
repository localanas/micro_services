package org.exam_chebihi.web;

import org.exam_chebihi.dao.AuthorService;
import org.exam_chebihi.entities.Author;
import org.exam_chebihi.entities.BooksItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("v1")
public class AuthorController {

	final AuthorService authorService;


	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}


	@GetMapping()
	public String getBooks()
	{
		return new String("books");
	}
	@GetMapping("version2/{id}")
	public Author getBooksByAuthor(@PathVariable("id") int id)
	{
		Author author = authorService.getBooks(id);
		System.out.println(author.getName());
		return author;
	}
}
