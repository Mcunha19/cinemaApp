package repository.webApp;

import repository.webApp.models.Session;
import repository.webApp.models.Ticket;

public class Utility {

    static public String repeatedCharString(String letter, int repetitions){

        String string = "";
        for(int i = 0; i < repetitions; i++){
            string = string.concat(letter);
        }

        return string;
    }

    static public Session changeSeatAvailability(Ticket ticket){
        Session session = ticket.getSession();
        if(ticket.getSeatRow() == 'A'){
            String string = session.getSeatAvailabilityRowA();
            string = string.substring(0, ticket.getSeatNumber() - 1) + "O"
                    + string.substring(ticket.getSeatNumber());
            session.setSeatAvailabilityRowA(string);
        }

        if(ticket.getSeatRow() == 'B'){
            String string = session.getSeatAvailabilityRowB();
            string = string.substring(0, ticket.getSeatNumber() - 1) + "O"
                    + string.substring(ticket.getSeatNumber());
            session.setSeatAvailabilityRowB(string);
        }

        if(ticket.getSeatRow() == 'C'){
            String string = session.getSeatAvailabilityRowC();
            string = string.substring(0, ticket.getSeatNumber() - 1) + "O"
                    + string.substring(ticket.getSeatNumber());
            session.setSeatAvailabilityRowC(string);
        }

        if(ticket.getSeatRow() == 'D'){
            String string = session.getSeatAvailabilityRowD();
            string = string.substring(0, ticket.getSeatNumber() - 1) + "O"
                    + string.substring(ticket.getSeatNumber());
            session.setSeatAvailabilityRowD(string);
        }

        if(ticket.getSeatRow() == 'E'){
            String string = session.getSeatAvailabilityRowE();
            string = string.substring(0, ticket.getSeatNumber() - 1) + "O"
                    + string.substring(ticket.getSeatNumber());
            session.setSeatAvailabilityRowE(string);
        }

        if(ticket.getSeatRow() == 'F'){
            String string = session.getSeatAvailabilityRowF();
            string = string.substring(0, ticket.getSeatNumber() - 1) + "O"
                    + string.substring(ticket.getSeatNumber());
            session.setSeatAvailabilityRowF(string);
        }

        if(ticket.getSeatRow() == 'G'){
            String string = session.getSeatAvailabilityRowG();
            string = string.substring(0, ticket.getSeatNumber() - 1) + "O"
                    + string.substring(ticket.getSeatNumber());
            session.setSeatAvailabilityRowG(string);
        }

        if(ticket.getSeatRow() == 'H'){
            String string = session.getSeatAvailabilityRowH();
            string = string.substring(0, ticket.getSeatNumber() - 1) + "O"
                    + string.substring(ticket.getSeatNumber());
            session.setSeatAvailabilityRowH(string);
        }
        return session;
    }

}
