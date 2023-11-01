package Homeworks.HW_4;

import java.util.Date;

class Ticket{
    {
        this.id = ++counter;
    }

    Ticket(int customerId, double price) {
        this.customerId = customerId;
        this.price = price;
        updateQRCode();
    }

    private static int counter;
    private final int id;
    private final int customerId;
    private final Date date = new Date();
    private final double price;
    private String qrcode;
    private boolean enable = true;

    private void updateQRCode() {
        this.qrcode = String.format("ticket_id=%d&customer_id=%d&date=%s", this.id, this.customerId, this.date);
    }

    public int getId() {
        return id;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getQrcode() {
        return qrcode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        if (this.enable) {
            return String.format("Билет №_%d (куплен: %s, покупатель №_%d,  статус: не использован)",
                    this.id, this.date, this.customerId);
        }
        else {
            return String.format("Билет №_%d (куплен: %s, покупатель №_%d,  статус: использован)",
                    this.id, this.date, this.customerId);
        }
    }
}
