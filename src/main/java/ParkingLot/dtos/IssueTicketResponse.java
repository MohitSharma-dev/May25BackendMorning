package ParkingLot.dtos;

public class IssueTicketResponse {
    private Long ticketId;
    private ResponseStatus responseStatus;
    private String failureMessage;

    public IssueTicketResponse() {}

    public IssueTicketResponse(Long ticketId, ResponseStatus responseStatus, String failureMessage) {
        this.ticketId = ticketId;
        this.responseStatus = responseStatus;
        this.failureMessage = failureMessage;
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
