package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private int id;

    private String trainNo;

    private String trainName;

    private List<List<Integer>> seats;

    private Map<String, String> station;

    private List<String> stations;

    public Train(int id, String trainNo, String trainName, List<List<Integer>> seats, Map<String, String> station, List<String> stations) {
        this.id = id;
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.seats = seats;
        this.station = station;
        this.stations = stations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public Map<String, String> getStation() {
        return station;
    }

    public void setStation(Map<String, String> station) {
        this.station = station;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }
}
