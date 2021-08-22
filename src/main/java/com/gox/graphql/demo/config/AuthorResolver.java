package com.gox.graphql.demo.config;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gox.graphql.demo.entity.Author;
import com.gox.graphql.demo.entity.Post;
import com.gox.graphql.demo.repository.PostRepository;

import java.util.List;

public class AuthorResolver implements GraphQLResolver<Author> {

    private PostRepository postRepository;

    public AuthorResolver(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts(Author author) {
        return postRepository.findAllByAuthor(author);
    }
}
