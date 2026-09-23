package mvc.spring.springwebapp.domain;

import jakarta.persistence.Entity



@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;


}