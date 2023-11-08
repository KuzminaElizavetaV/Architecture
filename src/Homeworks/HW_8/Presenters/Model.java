package Homeworks.HW_8.Presenters;


import Homeworks.HW_8.Models.Reservation;
import Homeworks.HW_8.Models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();


    int reservationTable(Date reservationDate, int tableNo, String name);
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
