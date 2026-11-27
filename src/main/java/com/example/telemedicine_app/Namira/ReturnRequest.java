package com.example.telemedicine_app.Namira;

import java.io.Serializable;
import java.time.LocalDate;

public class ReturnRequest implements Serializable {
    private final String requestId, orderId, type, reason;
    private final LocalDate requestDate;
    private String status, rejectionReason;
    private double refundAmount;

    public ReturnRequest(String requestId, String orderId, String type, String reason,
                         LocalDate requestDate, String status, String rejectionReason,
                         double refundAmount) {
        this.requestId = requestId;
        this.orderId = orderId;
        this.type = type;
        this.reason = reason;
        this.requestDate = requestDate;
        this.status ="Pending";
        this.rejectionReason = "";
        this.refundAmount = 0;
    }
    public String getRequestId() {
        return requestId;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getType() {
        return type;
    }
    public String getReason() {
        return reason;
    }
    public LocalDate getRequestDate() {
        return requestDate;
    }
    public String getStatus() {
        return status;
    }
    public String getRejectionReason() {
        return rejectionReason;
    }
    public double getRefundAmount() {
        return refundAmount;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }
    @Override
    public String toString() {
        return "ReturnRequest{" +
                "requestId='" + requestId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", type='" + type + '\'' +
                ", reason='" + reason + '\'' +
                ", requestDate=" + requestDate +
                ", status='" + status + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                ", refundAmount=" + refundAmount +
                '}';
    }
    public void approve(){
        this.status = "Approved";
    }
    public void reject(String reason){
        this.status = "Rejected";
        this.rejectionReason = reason;
    }
}
