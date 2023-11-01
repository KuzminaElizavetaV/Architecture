package Homeworks.HW_4;

import java.util.ArrayList;
import java.util.Collection;

public class Customer {

    {
        id = ++counter;
    }

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private static int counter;
    private final int id;
    private final String login;
    private String password;

    private ArrayList<Ticket> tickets = new ArrayList<>();

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    public int numberTickets() {
        return this.tickets.size();
    }
    public Ticket getLastTicket(ArrayList<Ticket> tickets) {
        return tickets.get(numberTickets() -1);
    }


    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    @Override
    public String toString() {
        return String.format("Покупатель №_%d (логин: %s, пароль: %s)",
                this.id, this.login, this.password);
    }
}
