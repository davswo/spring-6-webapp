package dsw.springframework.spring6webapp.services;

import dsw.springframework.spring6webapp.domain.Book;


public interface BookService {

    Iterable<Book> findAll();

}
