package com.gox.graphql.demo.repository;

import com.gox.graphql.demo.entity.Author;
import com.gox.graphql.demo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> findAllByAuthor(Author author);
}
