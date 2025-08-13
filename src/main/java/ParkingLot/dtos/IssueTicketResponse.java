package ParkingLot.dtos;

public class IssueTicketResponse {
    private Long ticketId;
    private String slotNumber;
    private ResponseStatus responseStatus;
    private String failureMessage;

    public IssueTicketResponse() {}

    public IssueTicketResponse(Long ticketId, ResponseStatus responseStatus, String failureMessage, String slotNumber) {
        this.ticketId = ticketId;
        this.slotNumber = slotNumber;
        this.responseStatus = responseStatus;
        this.failureMessage = failureMessage;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }
}
