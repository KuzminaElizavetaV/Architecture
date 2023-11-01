package Homeworks.HW_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Database {

    private final Collection<Ticket> tickets = new ArrayList<>();
    private final Collection<Customer> customers = new ArrayList<>();
    private final Collection<Order> orders = new ArrayList<>();

    {
        for (int i = 1; i <= 10; i++) {
            Customer customer = new Customer(String.format("login_%d", i), String.format("passwd_%d", i));
            for (int j = 0; j < new Random().nextInt(1, 5); j++) {
                Ticket ticket = new Ticket(customer.getId(), this.getTicketAmount());
                customer.addTicket(ticket);
                this.tickets.add(ticket);
            }
            this.customers.add(customer);
        }
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    /**
     * Получить актуальную стоимость билета
     * @return Стоимость
     */
    public double getTicketAmount(){
        return 55;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     *
     */
    public Order createTicketOrder(int clientId, Ticket ticket) {
        this.tickets.add(ticket);
        Order order = new Order(clientId, ticket.getId());
        this.orders.add(order);
        return order;
    }

    public boolean addCustomer(Customer customer) {
        this.customers.add(customer);
        return true;
    }
}
