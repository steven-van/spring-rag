package fr.efrei.springrag.domain;

import jakarta.persistence.*;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private String title;
    private String description;
    private String author;
    private String publisher;

    public Long getId() {
        return this.id;
    }
}
