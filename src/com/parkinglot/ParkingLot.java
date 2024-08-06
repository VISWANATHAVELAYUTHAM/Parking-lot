package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot() {
        this.floors = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public ParkingSlot allocateSlot(ParkingSlotType type) {
        for (ParkingFloor floor : floors) {
            ParkingSlot slot = floor.findAvailableSlot(type);
            if (slot != null) {
                slot.occupy();
                return slot;
            }
        }
        return null; // No available slot
    }

    public void vacateSlot(int slotId) {
        for (ParkingFloor floor : floors) {
            for (ParkingSlot slot : floor.getParkingSlots()) {
                if (slot.getSlotId() == slotId) {
                    slot.vacate();
                    return;
                }
            }
        }
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }
}
