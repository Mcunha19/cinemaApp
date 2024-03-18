package repository.webApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.webApp.models.Room;
import repository.webApp.repositories.RoomRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "/apis/room")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @PostMapping
    public Room addRoom(Room room){
        roomRepository.save(room);
        System.out.println(room);
        return room;
    }

    @GetMapping
    public Iterable<Room> getRooms(){
        return roomRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Room> getRoom(@PathVariable int id){
        return roomRepository.findById(id);
    }
}
