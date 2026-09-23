package mvc.spring.springwebapp.domain;

import jakarta.persistence.Entity

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;


    public Author() {}
}