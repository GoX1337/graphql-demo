package com.gox.graphql.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {

    public Author(Long id, String name){
        this.id = id;
        this.name = name;
    }

    @Id
    private Long id;
    private String name;

    @OneToMany
    List<Post> posts;
}
