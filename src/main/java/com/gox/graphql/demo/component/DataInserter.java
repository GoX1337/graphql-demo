package com.gox.graphql.demo.component;

import com.gox.graphql.demo.entity.Author;
import com.gox.graphql.demo.entity.Post;
import com.gox.graphql.demo.repository.AuthorRepository;
import com.gox.graphql.demo.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInserter implements CommandLineRunner {

    private PostRepository postRepository;

    private AuthorRepository authorRepository;

    public DataInserter(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author a1 = new Author(1L, "José Papert");
        Author a2 = new Author(2L, "Anne Dufion");
        authorRepository.save(a1);
        authorRepository.save(a2);

        Post p1 = new Post(1L, "HIII", a1);
        Post p2 = new Post(2L, "YYYYYYYYYYYYYYY", a2);
        Post p3 = new Post(3L, "GGGGGGG", a1);
        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);

    }
}
