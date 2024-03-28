package repository.webApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.webApp.models.Session;
import repository.webApp.models.SessionWrapper;
import repository.webApp.repositories.MovieRepository;
import repository.webApp.repositories.RoomRepository;
import repository.webApp.repositories.SessionRepository;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping(path = "/apis/session")
public class SessionController {

    @Autowired
    public SessionRepository sessionRepository;

    @PostMapping
    public Session postSession(@RequestBody SessionWrapper wrapper) throws ParseException {

        String date = wrapper.getDate();
        System.out.println(date);
        String time = wrapper.getTime();
        System.out.println(time);
        String dateAndTime = date.concat(" ").concat(time).concat(":00");
        SimpleDateFormat timestampFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        java.util.Date parsedTimestamp = timestampFormatter.parse(dateAndTime);
        Timestamp timestamp = new Timestamp(parsedTimestamp.getTime());

        Session session = new Session(wrapper.getMovie(), wrapper.getRoom(), timestamp);
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

    @DeleteMapping
    public Optional<Session> deleteSession(@RequestBody Map<String, Object> jsonMap){
        int id = Integer.parseInt((String) jsonMap.get("id"));
        Optional<Session> session = sessionRepository.findById(id);
        sessionRepository.deleteById(id);
        return session;
    }
}
