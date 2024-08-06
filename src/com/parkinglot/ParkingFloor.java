package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSlots = new ArrayList<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void addParkingSlot(ParkingSlot slot) {
        parkingSlots.add(slot);
    }

    public ParkingSlot findAvailableSlot(ParkingSlotType type) {
        for (ParkingSlot slot : parkingSlots) {
            if (slot.getType() == type && !slot.isOccupied()) {
                return slot;
            }
        }
        return null;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }
}
