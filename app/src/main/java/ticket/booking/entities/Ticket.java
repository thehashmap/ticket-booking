package ticket.booking.entities;

import java.util.Date;

public class Ticket {
    private int id;

    private String userId;

    private String destination;

    private String source;

    private String date;

    private Train train;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Ticket(int id, String userId, String destination, String source, String date, Train train) {
        this.id = id;
        this.userId = userId;
        this.destination = destination;
        this.source = source;
        this.date = date;
        this.train = train;
    }
}
