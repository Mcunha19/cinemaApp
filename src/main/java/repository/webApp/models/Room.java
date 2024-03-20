package repository.webApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int number;

    private int seatCountRowA;

    private int seatCountRowB;

    private int seatCountRowC;

    private int seatCountRowD;

    private int seatCountRowE;

    private int seatCountRowF;

    private int seatCountRowG;

    private int seatCountRowH;

    public Room(int number, int seatCountRowA, int seatCountRowB, int seatCountRowC, int seatCountRowD, int seatCountRowE, int seatCountRowF, int seatCountRowG, int seatCountRowH) {
        this.number = number;
        this.seatCountRowA = seatCountRowA;
        this.seatCountRowB = seatCountRowB;
        this.seatCountRowC = seatCountRowC;
        this.seatCountRowD = seatCountRowD;
        this.seatCountRowE = seatCountRowE;
        this.seatCountRowF = seatCountRowF;
        this.seatCountRowG = seatCountRowG;
        this.seatCountRowH = seatCountRowH;
    }

    public Room() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeatCountRowA() {
        return seatCountRowA;
    }

    public void setSeatCountRowA(int seatCountRowA) {
        this.seatCountRowA = seatCountRowA;
    }

    public int getSeatCountRowB() {
        return seatCountRowB;
    }

    public void setSeatCountRowB(int seatCountRowB) {
        this.seatCountRowB = seatCountRowB;
    }

    public int getSeatCountRowC() {
        return seatCountRowC;
    }

    public void setSeatCountRowC(int seatCountRowC) {
        this.seatCountRowC = seatCountRowC;
    }

    public int getSeatCountRowD() {
        return seatCountRowD;
    }

    public void setSeatCountRowD(int seatCountRowD) {
        this.seatCountRowD = seatCountRowD;
    }

    public int getSeatCountRowE() {
        return seatCountRowE;
    }

    public void setSeatCountRowE(int seatCountRowE) {
        this.seatCountRowE = seatCountRowE;
    }

    public int getSeatCountRowF() {
        return seatCountRowF;
    }

    public void setSeatCountRowF(int seatCountRowF) {
        this.seatCountRowF = seatCountRowF;
    }

    public int getSeatCountRowG() {
        return seatCountRowG;
    }

    public void setSeatCountRowG(int seatCountRowG) {
        this.seatCountRowG = seatCountRowG;
    }

    public int getSeatCountRowH() {
        return seatCountRowH;
    }

    public void setSeatCountRowH(int seatCountRowH) {
        this.seatCountRowH = seatCountRowH;
    }
}
