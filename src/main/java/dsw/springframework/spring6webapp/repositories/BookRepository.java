package dsw.springframework.spring6webapp.repositories;

import dsw.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
