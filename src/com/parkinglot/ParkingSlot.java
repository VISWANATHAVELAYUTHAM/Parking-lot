package com.parkinglot;

public class ParkingSlot {
    private int slotId;
    private ParkingSlotType type;
    private boolean isOccupied;

    public ParkingSlot(int slotId, ParkingSlotType type) {
        this.slotId = slotId;
        this.type = type;
        this.isOccupied = false;
    }

    public int getSlotId() {
        return slotId;
    }

    public ParkingSlotType getType() {
        return type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy() {
        if (!isOccupied) {
            isOccupied = true;
        } else {
            throw new IllegalStateException("Parking slot is already occupied.");
        }
    }

    public void vacate() {
        if (isOccupied) {
            isOccupied = false;
        } else {
            throw new IllegalStateException("Parking slot is already vacant.");
        }
    }
}
