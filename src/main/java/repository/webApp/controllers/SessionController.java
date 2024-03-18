package repository.webApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.webApp.models.Session;
import repository.webApp.repositories.SessionRepository;

import java.util.Optional;

@RestController
@RequestMapping(path = "apis/session")
public class SessionController {

    @Autowired
    public SessionRepository sessionRepository;

    @PostMapping
    public Session postSession(Session session){
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
