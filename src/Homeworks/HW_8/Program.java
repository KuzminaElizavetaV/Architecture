package Homeworks.HW_8;


import Homeworks.HW_8.Models.TableModel;
import Homeworks.HW_8.Presenters.BookingPresenter;
import Homeworks.HW_8.Presenters.Model;
import Homeworks.HW_8.Views.BookingView;

import java.util.Date;

public class Program {

    //TODO: метод changeReservationTable должен заработать
    public static void main(String[] args) {
        Model model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTables();

        view.reservationTable(new Date(), 3, "Станислав");
        view.changeReservationTable(1001, new Date(), 2, "Станислав");
    }

}
