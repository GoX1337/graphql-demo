package com.gox.graphql.demo.config;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gox.graphql.demo.entity.Author;
import com.gox.graphql.demo.entity.Post;

public class PostResolver implements GraphQLResolver<Post>  {

    public Author getAuthor(Post post) {
        return post.getAuthor();
    }
}
