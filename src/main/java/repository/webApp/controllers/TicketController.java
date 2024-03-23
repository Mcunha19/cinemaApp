package repository.webApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.webApp.Utility;
import repository.webApp.models.Session;
import repository.webApp.models.Ticket;
import repository.webApp.repositories.SessionRepository;
import repository.webApp.repositories.TicketRepository;

@RestController
@RequestMapping(path = "apis/ticket")
public class TicketController {

    @Autowired
    public TicketRepository ticketRepository;
    @Autowired
    public SessionRepository sessionRepository;

    @PostMapping
    public void buyTicket(Ticket ticket){
        Session session = Utility.changeSeatAvailability(ticket);
        System.out.println(session.getSeatAvailabilityRowB());
        System.out.println(ticket);
        sessionRepository.save(session);
        ticketRepository.save(ticket);
    }

    @GetMapping
    public Iterable<Ticket> getTickets(Ticket ticket){
        return ticketRepository.findAll();
    }
}
