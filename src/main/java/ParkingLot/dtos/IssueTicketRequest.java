package ParkingLot.dtos;

public class IssueTicketRequest {
    private String licensePlateNumber;
    private String ownerName;
    private int gateId;

    public IssueTicketRequest(String licensePlateNumber, int gateId, String ownerName) {
        this.licensePlateNumber = licensePlateNumber;
        this.gateId = gateId;
        this.ownerName = ownerName;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
