package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Author;
import pl.coderslab.model.Book;
import pl.coderslab.model.Category;
import pl.coderslab.model.Publisher;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findBookByTitle(String title);
    List<Book> findBookByCategory(Category category);
    List<Book> findBookByCategoryId(Long categoryId);

    List<Book> findBookByAuthors(Author author);
    List<Book> findBookByPublisher(Publisher publisher);
    List<Book> findByRatingIsLessThan(int rating);
    Book findFirstByCategory(Category category);

    @Query("SELECT b FROM Book b WHERE b.title = :title")
    Optional<Book> customFindBookByTitle(@Param("title") String title);

    @Query("SELECT b FROM Book b WHERE b.category = :category")
    List<Book> customFindByCategory(@Param("category")Category category);

    @Query("SELECT b FROM Book b WHERE b.rating BETWEEN :minValue AND :maxValue")
    List<Book> customFindByRating(@Param("minValue")Integer minValue, @Param("maxValue")Integer maxValue);

    @Query("SELECT b FROM Book b WHERE b.publisher = :publisher")
    List<Book> customFindByPublisher(@Param("publisher")Publisher publisher);

    @Query("SELECT b FROM Book b WHERE b.category = :category ORDER BY b.title ASC")
    Optional<Book> customFindByCategorySortByTitle(@Param("category")Category category);
}
