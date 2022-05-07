package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Author;
import pl.coderslab.model.Book;
import pl.coderslab.model.Category;
import pl.coderslab.model.Publisher;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findBookByTitle(String title);
    List<Book> findBookByCategory(Category category);
    List<Book> findBookByCategoryId(Long categoryId);

    List<Book> findBookByAuthors(Author author);
    List<Book> findBookByPublisher(Publisher publisher);
    List<Book> findByRatingIsLessThan(int rating);
    Book findFirstByCategory(Category category);

}
