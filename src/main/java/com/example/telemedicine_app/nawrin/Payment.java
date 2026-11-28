package com.example.telemedicine_app.nawrin;

public class Payment {
    private String transactionId, method, status;
    private double consultationFee, serviceCharge, refundAmount;

    public Payment(double consultationFee, String method, double refundAmount, double serviceCharge, String status, String transactionId) {
        this.consultationFee = consultationFee;
        this.method = method;
        this.refundAmount = refundAmount;
        this.serviceCharge = serviceCharge;
        this.status = status;
        this.transactionId = transactionId;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "consultationFee=" + consultationFee +
                ", transactionId='" + transactionId + '\'' +
                ", method='" + method + '\'' +
                ", status='" + status + '\'' +
                ", serviceCharge=" + serviceCharge +
                ", refundAmount=" + refundAmount +
                '}';
    }
}
