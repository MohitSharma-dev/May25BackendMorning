package ParkingLot.services;

import InheritanceAndConstructors.D;
import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TicketRepository ticketRepository
                         ) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
            Long gateId,
            String licensePlateNumber,
            String ownerName,
            VehicleType vehicleType,
            Long parkingLotId
    ){
        // 1. Get the Gate details using gateID
        Optional<Gate> gateOptional = gateRepository.findGateByGateId(gateId);
        if(gateOptional.isEmpty()){
            throw new RuntimeException("Invalid gate id");
        }
        Gate gate = gateOptional.get();
        // 2. Get the Vehicle details , if not present create a new vehicle
        Optional<Vehicle> vehicle = vehicleRepository.findVehicleByLicensePlateNumber(licensePlateNumber);
        Vehicle vehicleInfo = null;
        if(vehicle.isEmpty()){
            vehicleInfo = new Vehicle();
            vehicleInfo.setVehicleType(vehicleType);
            vehicleInfo.setLicensePlate(licensePlateNumber);
            vehicleInfo.setOwnerName(ownerName);
            // save the vehicle in db

        } else {
            vehicleInfo = vehicle.get();
        }

        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findParkingLotById(parkingLotId);
        if(parkingLotOptional.isEmpty()){
            throw new RuntimeException("Invalid parking lot id");
        }
        ParkingLot parkingLot = parkingLotOptional.get();
        // 3. Assign a Slot
        ParkingSlot parkingSlot =
                parkingLot
                .getSlotAssignmentStrategy()
                .assignSlot(parkingLot , vehicleType);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);
        // 4. Create a new Ticket Object, set the attributes
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setOperator(gate.getCurrentOperator());
        ticket.setParkingSlot(parkingSlot);
        ticket.setVehicle(vehicleInfo);
        ticket.setEntryGate(gate);
        ticket.setFeeCalculationStrategyType(parkingLot.getFeeCalculationStrategyType());
        ticket.setParkingFloor(parkingSlot.getParkingFloor());


        // 5. return the object
        return ticketRepository.save(ticket);    }
}

// issueTicket ()



