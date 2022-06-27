package org.exam_chebihi.dao;

import org.exam_chebihi.entities.BooksItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookItemsRepository extends JpaRepository<BooksItem, Long> {
        public List<BooksItem> findBooksItemByAuthor(int id);
}
