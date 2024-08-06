class Vehicle {
    private String licensePlate;
    private ParkingSlotType type;

    public Vehicle(String licensePlate, ParkingSlotType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public ParkingSlotType getType() {
        return type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

