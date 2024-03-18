package repository.webApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import repository.webApp.models.Room;

@Repository
public interface RoomRepository
        extends CrudRepository<Room,Integer>{
}
