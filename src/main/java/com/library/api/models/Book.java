package com.library.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @ManyToOne
<<<<<<< HEAD
    @JoinColumn(name = "category_id")
=======
    @JoinColumn(name="category_id")
>>>>>>> 618aae9 (init)
    private Category category;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
