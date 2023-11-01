package Homeworks.HW_4;

/**
 * Автобусная станция (отдельный комплекс)
 */
public class BusStation {

    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider){
        this.ticketProvider = ticketProvider;
    }

    public void checkTicket(String qrCode){
        ticketProvider.checkTicket(qrCode);
    }
}
