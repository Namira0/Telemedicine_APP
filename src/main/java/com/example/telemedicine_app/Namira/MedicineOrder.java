package com.example.telemedicine_app.Namira;

import java.io.Serializable;
import java.time.LocalDate;

public class MedicineOrder implements Serializable {
    private final String orderId;
    private final String patientId;
    private final String sellerId;
    private String prescriptionId;
    private LocalDate orderDate;
    private String deliveryAddress;
    private double totalPrice;
    private String status;
    private String rejectionReason;
    private String deliveryPersonName;
    private String deliveryPersonPhone;

    public MedicineOrder(String orderId, String patientId, String sellerId, String prescriptionId,
                         LocalDate orderDate, String deliveryAddress, double totalPrice, String status,
                         String rejectionReason, String deliveryPersonName, String deliveryPersonPhone) {
        this.orderId = orderId;
        this.patientId = patientId;
        this.sellerId = sellerId;
        this.prescriptionId = prescriptionId;
        this.orderDate = orderDate;
        this.deliveryAddress = deliveryAddress;
        this.totalPrice = totalPrice;
        this.status = status;
        this.rejectionReason = rejectionReason;
        this.deliveryPersonName = deliveryPersonName;
        this.deliveryPersonPhone = deliveryPersonPhone;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getPatientId() {
        return patientId;
    }
    public String getSellerId() {
        return sellerId;
    }
    public String getPrescriptionId() {
        return prescriptionId;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public String getStatus() {
        return status;
    }
    public String getRejectionReason() {
        return rejectionReason;
    }
    public String getDeliveryPersonName() {
        return deliveryPersonName;
    }
    public String getDeliveryPersonPhone() {
        return deliveryPersonPhone;
    }
    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
    public void setDeliveryPersonName(String deliveryPersonName) {
        this.deliveryPersonName = deliveryPersonName;
    }
    public void setDeliveryPersonPhone(String deliveryPersonPhone) {
        this.deliveryPersonPhone = deliveryPersonPhone;
    }
    @Override
    public String toString() {
        return "MedicineOrder{" +
                "orderId='" + orderId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", prescriptionId='" + prescriptionId + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                ", deliveryPersonName='" + deliveryPersonName + '\'' +
                ", deliveryPersonPhone='" + deliveryPersonPhone + '\'' +
                '}';
    }
    public void accept() {
        this.status = "Accepted";
    }
    public void reject(String reason) {
        this.status = "Rejected";
        this.rejectionReason = reason;
    }
    public void assignDelivery(String personName, String personPhone) {
        this.deliveryPersonName = personName;
        this.deliveryPersonPhone = personPhone;
        this.status = "Out for delivery";
    }
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}
