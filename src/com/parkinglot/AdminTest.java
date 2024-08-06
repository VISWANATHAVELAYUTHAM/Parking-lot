public class AdminTest {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Admin admin = new Admin(parkingLot);

        // Admin Case 1 - should be able to add parking floor
        admin.addFloor(1);

        // Admin Case 2 - should be able to add parking floor
        admin.addFloor(2);

        // Admin Case 3 - should be able to add entrance panel
        admin.addEntryPanel(1);

        // Admin Case 4 - should be able to add exit panel
        admin.addExitPanel(1);

        // Admin Case 5 - should be able to add car parking spot
        admin.addParkingSlot(1, new ParkingSlot(101, ParkingSlotType.CAR));

        // Admin Case 6 - should be able to add bike parking spot
        admin.addParkingSlot(1, new ParkingSlot(102, ParkingSlotType.MOTORBIKE));

        // Admin Case 7 - should be able to add car parking spot
        admin.addParkingSlot(1, new ParkingSlot(103, ParkingSlotType.CAR));
    }
}

