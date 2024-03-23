package repository.webApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import repository.webApp.models.Ticket;

@Repository
public interface TicketRepository
        extends CrudRepository<Ticket,Integer>{
}
