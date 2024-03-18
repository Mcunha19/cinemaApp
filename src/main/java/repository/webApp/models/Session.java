package repository.webApp.models;

import jakarta.persistence.*;

@Entity
public class Session {

    @ManyToOne
    @JoinColumn(name="movie_id", nullable=false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="room_id", nullable=false)
    private Room room;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Session(Movie movie, Room room) {
        this.movie = movie;
        this.room = room;
    }

    public Session() {

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
}
