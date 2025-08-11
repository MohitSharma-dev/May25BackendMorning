package ParkingLot.models;

import java.util.HashMap;
import java.util.List;

public class ParkingLot extends BaseModel {
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private HashMap<VehicleType, Integer> allowedVehicleTypes;

    public HashMap<VehicleType, Integer> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(HashMap<VehicleType, Integer> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}

// Admin : admin/floors/add

// Vt1 : c1
// Vt2 : c2

// Whenever you decide use Hashmap , think if we should actually create a class Instead

// Using booleans is not good idea at all


// vehicleType
// TotalSlots
// AvailableSlots
// ServiceSlots
// outofOrderslots

