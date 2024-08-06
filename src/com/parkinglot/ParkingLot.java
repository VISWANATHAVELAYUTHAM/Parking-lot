import java.util.ArrayList;
import java.util.List;

class ParkingLot {
    private List<ParkingFloor> floors;
    private List<EntryPanel> entryPanels;
    private List<ExitPanel> exitPanels;

    public ParkingLot() {
        this.floors = new ArrayList<>();
        this.entryPanels = new ArrayList<>();
        this.exitPanels = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public void addEntryPanel(EntryPanel panel) {
        entryPanels.add(panel);
    }

    public void addExitPanel(ExitPanel panel) {
        exitPanels.add(panel);
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public ParkingSlot findAvailableSlot(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSlot slot = floor.findAvailableSlot(vehicle.getType());
            if (slot != null) {
                return slot;
            }
        }
        return null;
    }

    public Ticket issueTicket(Vehicle vehicle) {
        ParkingSlot slot = findAvailableSlot(vehicle);
        if (slot != null) {
            slot.park();
            return new Ticket(vehicle, slot);
        }
        return null;
    }

    public double calculateParkingCharge(Ticket ticket) {
        // Implement charge calculation logic based on entry and exit times
        return 0.0;
    }

    public void vacateSlot(Ticket ticket) {
        ticket.getSlot().vacate();
    }
}

