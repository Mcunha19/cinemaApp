package repository.webApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import repository.webApp.models.Session;

@Repository
public interface SessionRepository
        extends CrudRepository<Session,Integer>{
}
