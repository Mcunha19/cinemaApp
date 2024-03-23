package repository.webApp.models;

import jakarta.persistence.*;
import repository.webApp.Utility;

import java.sql.Timestamp;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="movie_id", nullable=false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="room_id", nullable=false)
    private Room room;

    private Timestamp timestamp;

    private String seatAvailabilityRowA;

    private String seatAvailabilityRowB;

    private String seatAvailabilityRowC;

    private String seatAvailabilityRowD;

    private String seatAvailabilityRowE;

    private String seatAvailabilityRowF;

    private String seatAvailabilityRowG;

    private String seatAvailabilityRowH;

    public Session(Movie movie, Room room, Timestamp timestamp) {
        this.movie = movie;
        this.room = room;
        this.timestamp = timestamp;
        this.seatAvailabilityRowA = Utility.repeatedCharString("F",room.getSeatCountRowA());
        this.seatAvailabilityRowB = Utility.repeatedCharString("F",room.getSeatCountRowB());
        this.seatAvailabilityRowC = Utility.repeatedCharString("F",room.getSeatCountRowC());
        this.seatAvailabilityRowD = Utility.repeatedCharString("F",room.getSeatCountRowD());
        this.seatAvailabilityRowE = Utility.repeatedCharString("F",room.getSeatCountRowE());
        this.seatAvailabilityRowF = Utility.repeatedCharString("F",room.getSeatCountRowF());
        this.seatAvailabilityRowG = Utility.repeatedCharString("F",room.getSeatCountRowG());
        this.seatAvailabilityRowH = Utility.repeatedCharString("F",room.getSeatCountRowH());
    }

    public Session() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getSeatAvailabilityRowA() {
        return seatAvailabilityRowA;
    }

    public void setSeatAvailabilityRowA(String seatAvailabilityRowA) {
        this.seatAvailabilityRowA = seatAvailabilityRowA;
    }

    public String getSeatAvailabilityRowB() {
        return seatAvailabilityRowB;
    }

    public void setSeatAvailabilityRowB(String seatAvailabilityRowB) {
        this.seatAvailabilityRowB = seatAvailabilityRowB;
    }

    public String getSeatAvailabilityRowC() {
        return seatAvailabilityRowC;
    }

    public void setSeatAvailabilityRowC(String seatAvailabilityRowC) {
        this.seatAvailabilityRowC = seatAvailabilityRowC;
    }

    public String getSeatAvailabilityRowD() {
        return seatAvailabilityRowD;
    }

    public void setSeatAvailabilityRowD(String seatAvailabilityRowD) {
        this.seatAvailabilityRowD = seatAvailabilityRowD;
    }

    public String getSeatAvailabilityRowE() {
        return seatAvailabilityRowE;
    }

    public void setSeatAvailabilityRowE(String seatAvailabilityRowE) {
        this.seatAvailabilityRowE = seatAvailabilityRowE;
    }

    public String getSeatAvailabilityRowF() {
        return seatAvailabilityRowF;
    }

    public void setSeatAvailabilityRowF(String seatAvailabilityRowF) {
        this.seatAvailabilityRowF = seatAvailabilityRowF;
    }

    public String getSeatAvailabilityRowG() {
        return seatAvailabilityRowG;
    }

    public void setSeatAvailabilityRowG(String seatAvailabilityRowG) {
        this.seatAvailabilityRowG = seatAvailabilityRowG;
    }

    public String getSeatAvailabilityRowH() {
        return seatAvailabilityRowH;
    }

    public void setSeatAvailabilityRowH(String seatAvailabilityRowH) {
        this.seatAvailabilityRowH = seatAvailabilityRowH;
    }
}
