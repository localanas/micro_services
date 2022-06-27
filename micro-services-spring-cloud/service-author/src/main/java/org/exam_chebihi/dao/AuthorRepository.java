package org.exam_chebihi.dao;

import org.exam_chebihi.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
