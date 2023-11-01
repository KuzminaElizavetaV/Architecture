package Homeworks.HW_4;

import java.util.Collection;
import java.util.Date;


public class MobileApp {
    private Customer customer;
    private final TicketProvider ticketProvider;
    private final CustomerProvider customerProvider;

    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider){
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;

    }

    public void getCustomerTickets(){
        for (Ticket ticket : customer.getTickets()) {
            System.out.println(ticket);
        }
    }

    public Collection<Ticket> searchTicketsByDate(Date date){
        return ticketProvider.searchTickets(customer.getId(), date);
    }

    public Ticket searchTicketByNumber(int numberTicket) {
        for (Ticket ticket : customer.getTickets()) {
            if (ticket.getId() == numberTicket)
                return ticket;
        }
        return null;
    }
    public Ticket getCustomerLastTicket() {
        return customer.getLastTicket(customer.getTickets());
    }

    public Ticket buyTicket(String cardNo){
        return ticketProvider.buyTicket(customer.getId(), cardNo);
    }

    public void logIn(String login, String password) {
        this.customer = customerProvider.getCustomer(login, password);
    }

    public void logOut() {
        this.customer = null;
    }

}
