
class Admin {
    private ParkingLot parkingLot;

    public Admin(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void addFloor(int floorNumber) {
        parkingLot.addFloor(new ParkingFloor(floorNumber));
    }

    public void addParkingSlot(int floorNumber, ParkingSlot slot) {
        for (ParkingFloor floor : parkingLot.getFloors()) {
            if (floor.getFloorNumber() == floorNumber) {
                floor.addParkingSlot(slot);
                return;
            }
        }
    }

    public void addEntryPanel(int panelId) {
        parkingLot.addEntryPanel(new EntryPanel(panelId, parkingLot));
    }

    public void addExitPanel(int panelId) {
        parkingLot.addExitPanel(new ExitPanel(panelId, parkingLot));
    }
}
