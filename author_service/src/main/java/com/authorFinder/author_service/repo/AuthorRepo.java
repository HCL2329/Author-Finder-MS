package com.authorFinder.author_service.repo;

import com.authorFinder.author_service.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
