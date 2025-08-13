package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequest;
import ParkingLot.dtos.IssueTicketResponse;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest request) {
        IssueTicketResponse response = new IssueTicketResponse();
        try {
           Ticket ticket = ticketService.issueTicket(
                   request.getGateId(),
                   request.getLicensePlateNumber(),
                   request.getOwnerName(),
                   request.getVehicleType(),
                   request.getParkingLotId()
           );
           response.setTicketId(ticket.getId());
           response.setSlotNumber(ticket.getParkingSlot().getParkingSlotNumber());
           response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }
        return response;
    }
}

// DTO : Data transfer object

// HW : Think about the business logic

// Client (User) -> call to your Backend
// API will be called
// GET , POST , PUT , PATCH , DELETE
// POST /ticket {} : TicketController
// Request will go to configured Controller
// Controller might want to run some validations on the request data
// Controller will call the service
// Service has the business logic