package ticket.booking.entities;

import java.util.List;

public class User {
    private int id;

    private String name;

    private String password;

    private String hashPassword;

    private List<Ticket> tickets;
}
