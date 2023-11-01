package Homeworks.HW_4;


public class Program {

/**
 * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
 * <p>
 * 1.  Предусловия.
 * 2.  Постусловия.
 * 3.  Инвариант.
 * 4.  Определить абстрактные и конкретные классы.
 * 5.  Определить интерфейсы.
 * 6.  Реализовать наследование.
 * 7.  Выявить компоненты.
 * 8.  Разработать Диаграмму компонент использую нотацию UML 2.0. Общая без деталей.
 */
    public static void main(String[] args) {
        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        System.out.println("CПИСОК ВСЕХ ПОКУПАТЕЛЕЙ");
        core.getCustomerProvider().getAllCustomers();
        System.out.println();
        System.out.println("СПИСОК ВСЕХ БИЛЕТОВ");
        core.getTicketProvider().getAllTickets();
        System.out.println();
        System.out.println("ПОКУПАТЕЛЬ №_3 ЛОГИНИТСЯ В МОБИЛЬНОМ ПРИЛОЖЕНИИ");
        mobileApp.logIn("login_3", "passwd_3");
        System.out.println("ВСЕ БИЛЕТЫ ПОКУПАТЕЛЯ №_3 на момент входа в приложение");
        mobileApp.getCustomerTickets();
        System.out.println();
        Ticket ticket1 = mobileApp.buyTicket("2203200852545196");
        System.out.println("ВСЕ БИЛЕТЫ ПОКУПАТЕЛЯ №_3 после покупки 1 билета");
        mobileApp.getCustomerTickets();
        System.out.println();
        System.out.println("ПОКУПАТЕЛЬ ПРИЕХАЛ НА АВТОСТАНЦИЮ И СЕЛ В АВТОБУС, ИСПОЛЬЗУЯ ПОСЛЕДНИЙ КУПЛЕННЫЙ БИЛЕТ");
        BusStation busStation = new BusStation(core.getTicketProvider());
        busStation.checkTicket(ticket1.getQrcode());
        System.out.println("ВСЕ БИЛЕТЫ ПОКУПАТЕЛЯ №_3");
        mobileApp.getCustomerTickets();
        mobileApp.logOut();

        System.out.println("ПОКУПАТЕЛЬ №_7 ЛОГИНИТСЯ В МОБИЛЬНОМ ПРИЛОЖЕНИИ");
        mobileApp.logIn("login_7", "passwd_7");
        System.out.println();
        System.out.println("ВСЕ БИЛЕТЫ ПОКУПАТЕЛЯ №_7 на момент входа в приложение");
        mobileApp.getCustomerTickets();
        System.out.println();
        System.out.println("НАЙДЕМ ПОСЛЕДНИЙ РАНЕЕ КУПЛЕННЫЙ БИЛЕТ");
        Ticket lastTicket = mobileApp.getCustomerLastTicket();
        System.out.println(lastTicket);
        System.out.println();
        System.out.println("ПОКУПАТЕЛЬ №_7 ПРИЕХАЛ НА АВТОСТАНЦИЮ И СЕЛ В АВТОБУС, ИСПОЛЬЗУЯ ПОСЛЕДНИЙ КУПЛЕННЫЙ БИЛЕТ");
        BusStation busStation1 = new BusStation(core.getTicketProvider());
        busStation1.checkTicket(lastTicket.getQrcode());
        System.out.println("ВСЕ БИЛЕТЫ ПОКУПАТЕЛЯ №_7");
        mobileApp.getCustomerTickets();
        mobileApp.logOut();
    }
}


