package com.example.telemedicine_app.Namira;

import java.io.Serializable;
import java.time.LocalDate;

public class Medicine implements Serializable {
    private final String medicineId;
    private final String sellerId;
    private final String brandName, genericName,manufacturer,strength;
    private double unitPrice,discountPercent;
    private int stockQuantity,reorderLevel;
    private LocalDate expiryDate;
    private boolean prescriptionRequired;

    public Medicine(String medicineId, String sellerId, String brandName, String genericName,
                    String manufacturer, String strength, double unitPrice,
                    double discountPercent, int stockQuantity, int reorderLevel,
                    LocalDate expiryDate, boolean prescriptionRequired) {
        this.medicineId = medicineId;
        this.sellerId = sellerId;
        this.brandName = brandName;
        this.genericName = genericName;
        this.manufacturer = manufacturer;
        this.strength = strength;
        this.unitPrice = unitPrice;
        this.discountPercent = discountPercent;
        this.stockQuantity = stockQuantity;
        this.reorderLevel = reorderLevel;
        this.expiryDate = expiryDate;
        this.prescriptionRequired = prescriptionRequired;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getStrength() {
        return strength;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public boolean isPrescriptionRequired() {
        return prescriptionRequired;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public void setPrescriptionRequired(boolean prescriptionRequired) {
        this.prescriptionRequired = prescriptionRequired;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId='" + medicineId + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", brandName='" + brandName + '\'' +
                ", genericName='" + genericName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", strength='" + strength + '\'' +
                ", unitPrice=" + unitPrice +
                ", discountPercent=" + discountPercent +
                ", stockQuantity=" + stockQuantity +
                ", reorderLevel=" + reorderLevel +
                ", expiryDate=" + expiryDate +
                ", prescriptionRequired=" + prescriptionRequired +
                '}';
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    public int getReorderLevel() {
        return reorderLevel;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public boolean isLowStock(){
        return stockQuantity <= reorderLevel;
    }
    public boolean isExpired(){
        return expiryDate.isBefore(LocalDate.now());
    }
    public double getDiscountedPrice(){
        return unitPrice - (unitPrice * discountPercent / 100);
    }
    public boolean reduceStock(int qty) {
        if (qty > stockQuantity) {
            return false;
        }
        stockQuantity = stockQuantity - qty;
        return true;
    }
}