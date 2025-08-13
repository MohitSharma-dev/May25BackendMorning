package ParkingLot.strategies;

import ParkingLot.models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy {
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor floor : parkingLot.getParkingFloors()) {
            for(ParkingSlot slot : floor.getParkingSlots()) {
                if(slot.getAllowedVehicleTypes().contains(vehicleType) &&
                slot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY)) {
                    return slot;
                }
            }
        }
        return null;
    }
}

