import java.time.LocalDateTime;

class Ticket {
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private ParkingSlot slot;

    public Ticket(Vehicle vehicle, ParkingSlot slot) {
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = LocalDateTime.now();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSlot getSlot() {
        return slot;
    }
}

