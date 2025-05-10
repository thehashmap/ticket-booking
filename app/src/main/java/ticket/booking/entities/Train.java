package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private int id;

    private String trainNo;

    private String trainName;

    private List<List<Integer>> seats;

    private Map<String, Time> station;

    private List<String> stations;
}
