package com.gox.graphql.demo.config;

import com.gox.graphql.demo.repository.AuthorRepository;
import com.gox.graphql.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    public GraphQLConfig(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @Bean
    public Query query(){
        return new Query(postRepository, authorRepository);
    }

    @Bean
    public PostResolver postResolver() {
        return new PostResolver();
    }

    @Bean
    public AuthorResolver authorResolver() {
        return new AuthorResolver(postRepository);
    }
}
