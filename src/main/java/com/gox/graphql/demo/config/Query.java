package com.gox.graphql.demo.config;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gox.graphql.demo.entity.Author;
import com.gox.graphql.demo.entity.Post;
import com.gox.graphql.demo.repository.AuthorRepository;
import com.gox.graphql.demo.repository.PostRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    public Query(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return postRepository.findAll();
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }
}