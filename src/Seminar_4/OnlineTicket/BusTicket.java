package Seminar_4.OnlineTicket;

class BusTicket extends Ticket {
    int number;

    @Override
    public boolean reserveTicket() {
        // Реализация метода
        return false;
    }

    @Override
    public boolean deductFunds() {
        // Реализация метода
        return false;
    }

    @Override
    public boolean confirmPurchase() {
        // Реализация метода
        return false;
    }

    @Override
    public void updateTicketAvailability() {
        // Реализация метода
    }

    @Override
    public boolean cancelReservation() {
        // Реализация метода
        return false;
    }
}