package Homeworks.HW_8.Models;



import Homeworks.HW_8.Presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;


    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(tableNo, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    public Table getTableByReservationNo(int reservationNo) {
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == reservationNo)
                    return table;
            }
        }
        throw new RuntimeException("Некорректный номер брони");
    }

    @Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        Table table = getTableByReservationNo(oldReservation);
        if (table != null) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation)
                    table.getReservations().remove(reservation);
                return reservationTable(reservationDate, tableNo, name);
            }

        }
        throw new RuntimeException("Невозможно изменить бронь... что-то пошло не так");
    }
}
