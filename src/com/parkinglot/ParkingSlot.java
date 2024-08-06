class ParkingSlot {
    private int slotNumber;
    private ParkingSlotType type;
    private boolean isOccupied;

    public ParkingSlot(int slotNumber, ParkingSlotType type) {
        this.slotNumber = slotNumber;
        this.type = type;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void park() {
        this.isOccupied = true;
    }

    public void vacate() {
        this.isOccupied = false;
    }

    public ParkingSlotType getType() {
        return type;
    }

    public int getSlotNumber() {
        return slotNumber;
    }
}

