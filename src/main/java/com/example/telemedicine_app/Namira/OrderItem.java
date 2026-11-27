package com.example.telemedicine_app.Namira;

import java.io.Serializable;

public class OrderItem implements Serializable {
    private final String orderId;
    private final String medicineId;
    private final double unitPrice;
    private int quantity;

    public OrderItem(String orderId, String medicineId,
                     double unitPrice, int quantity) {
        this.orderId = orderId;
        this.medicineId = medicineId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderId='" + orderId + '\'' +
                ", medicineId='" + medicineId + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
    public double getTotal(){
        return quantity * unitPrice;
    }
}
