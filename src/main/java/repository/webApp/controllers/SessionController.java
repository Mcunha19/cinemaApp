package repository.webApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.webApp.Utility;
import repository.webApp.models.Movie;
import repository.webApp.models.Room;
import repository.webApp.models.Session;
import repository.webApp.repositories.RoomRepository;
import repository.webApp.repositories.SessionRepository;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Optional;


@RestController
@RequestMapping(path = "apis/session")
public class SessionController {

    @Autowired
    public SessionRepository sessionRepository;

    @PostMapping
    public Session postSession(@RequestParam Movie movie, @RequestParam Room room, @RequestParam String date, @RequestParam String time) throws ParseException {

        String dateAndTime = date.replace(","," ").concat(time).concat(":00");
        SimpleDateFormat timestampFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        java.util.Date parsedTimestamp = timestampFormatter.parse(dateAndTime);
        Timestamp timestamp = new Timestamp(parsedTimestamp.getTime());



        Session session = new Session(movie, room, timestamp);
        sessionRepository.save(session);
        return session;
    }

    @GetMapping
    public Iterable<Session> getSessions(){
        return sessionRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Session> getSession(@PathVariable int id){
        return sessionRepository.findById(id);
    }
}
