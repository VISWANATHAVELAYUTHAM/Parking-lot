import java.util.ArrayList;
import java.util.List;

class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> slots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.slots = new ArrayList<>();
    }

    public void addParkingSlot(ParkingSlot slot) {
        slots.add(slot);
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public ParkingSlot findAvailableSlot(ParkingSlotType type) {
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied() && slot.getType() == type) {
                return slot;
            }
        }
        return null;
    }
}

