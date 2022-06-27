package org.exam_chebihi.dao;

import org.exam_chebihi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, String> {
}
