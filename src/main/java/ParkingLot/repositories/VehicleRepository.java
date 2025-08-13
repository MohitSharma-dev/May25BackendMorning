package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.*;

public class VehicleRepository {
    private Map<String , Vehicle> vehicles;
    private static Long counter = 0L;

    public VehicleRepository() {
        vehicles = new HashMap<>();
        // add some dummy data
    }
    public Optional<Vehicle> findVehicleByLicensePlateNumber(String licensePlateNumber){
        if(vehicles.containsKey(licensePlateNumber)){
            return Optional.of(vehicles.get(licensePlateNumber));
        }
        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle){
        vehicle.setId(++counter);
        vehicles.put(vehicle.getLicensePlate() , vehicle);
        return vehicle;
    }

    public Optional<Vehicle> findVehicleById(Long id){
        List<Vehicle> vehicleList =  vehicles.values().stream().toList();
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getId().equals(id)){
                return Optional.of(vehicle);
            }
        }
        return Optional.empty();
    }
}
