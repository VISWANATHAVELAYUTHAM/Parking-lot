class EntryPanel {
    private int panelId;
    private ParkingLot parkingLot;

    public EntryPanel(int panelId, ParkingLot parkingLot) {
        this.panelId = panelId;
        this.parkingLot = parkingLot;
    }

    public Ticket generateTicket(Vehicle vehicle) {
        return parkingLot.issueTicket(vehicle);
    }
}
