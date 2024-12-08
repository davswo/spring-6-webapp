package dsw.springframework.spring6webapp.services;

import dsw.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
