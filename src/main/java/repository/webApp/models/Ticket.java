package repository.webApp.models;

import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "session_id", nullable = false)
    private Session session;

    private char seatRow;

    private int seatNumber;

    private String buyerName;

    public Ticket(Session session, char seatRow, int seatNumber, String buyerName) {
        this.session = session;
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
        this.buyerName = buyerName;
    }

    public Ticket() {
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(char seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
}