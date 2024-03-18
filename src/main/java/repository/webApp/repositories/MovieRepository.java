package repository.webApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import repository.webApp.models.Movie;

@Repository
public interface MovieRepository
        extends CrudRepository<Movie,Integer> {
}
