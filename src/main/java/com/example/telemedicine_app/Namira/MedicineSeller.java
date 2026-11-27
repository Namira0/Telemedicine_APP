package com.example.telemedicine_app.Namira;

import com.example.telemedicine_app.common.User;

import java.io.Serializable;
import java.time.LocalDate;

public class MedicineSeller extends User implements Serializable {
    private final String licenseNo;
    private String shopName, shopAddress;
    private  int openingTime, closingTime;

    public MedicineSeller(String userId, String name, String email, String address, String password, String gender, String phoneNumber, LocalDate dateOfBirth, LocalDate registrationDate, boolean active, String licenseNo, String shopName, String shopAddress, int openningTime, int closingTime) {
        super(userId, name, email, address, password, gender, phoneNumber, dateOfBirth, registrationDate, active);
        this.licenseNo = licenseNo;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.openingTime = openningTime;
        this.closingTime = closingTime;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public int getOpeningTime() {
        return openingTime;
    }

    public int getClosingTime() {
        return closingTime;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public void setOpeningTime(int openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public String toString() {
        return "MedicineSeller{" +
                "licenseNo='" + licenseNo + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                '}';
    }
    @Override
    public void showDashboard() {
        // later: the controller loads PhysiotherapistDashboard.fxml
        System.out.println("Seller dashboard of " + getName());
    }
}
