class ExitPanel {
    private int panelId;
    private ParkingLot parkingLot;

    public ExitPanel(int panelId, ParkingLot parkingLot) {
        this.panelId = panelId;
        this.parkingLot = parkingLot;
    }

    public double processPayment(Ticket ticket) {
        double charge = parkingLot.calculateParkingCharge(ticket);
        parkingLot.vacateSlot(ticket);
        return charge;
    }
}
