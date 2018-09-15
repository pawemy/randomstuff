package com.example.jpa.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "posts")
public class Post extends AuditModel{
    private Long id;
    private String title;
    private String description;
    private String content;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    @NotNull
    @Size(max = 100)
    @Column(name = "title", unique = true)
    public String getTitle() {
        return title;
    }

    @NotNull
    @Column(name = "description", unique = true)
    public String getDescription() {
        return description;
    }

    @NotNull
    @Lob
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
