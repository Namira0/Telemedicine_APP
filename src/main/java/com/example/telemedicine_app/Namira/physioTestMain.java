package com.example.telemedicine_app.Namira;

import java.time.LocalDate;

public class physioTestMain {

    public static void main(String[] args) {

        // ---------- Good data: should all work ----------
        Physiotherapist p = new Physiotherapist("U001", "Rima", "rima@mail.com", "Dhaka",
                "Pass1234", "Female", "01712345678", LocalDate.of(1995, 5, 10),
                "PH-001", "Sports therapy", "BPT", "Heal Clinic",
                "Experienced physio", "MONDAY 10:00-12:00", "Bangla, English", 5, 800f, false);

        System.out.println(p);
        p.showDashboard();
        System.out.println("Login correct password: " + p.login("rima@mail.com", "Pass1234"));  // true
        System.out.println("Login wrong password:   " + p.login("rima@mail.com", "wrong"));     // false
        System.out.println("Age: " + p.getAge());

        // ---------- Bad data: each one should be rejected ----------
        expectError("negative fee",        () -> p.setConsultationFee(-100));
        expectError("negative experience", () -> p.setYearsOfExperience(-1));
        expectError("empty specialization",() -> p.setSpecialization("  "));
        expectError("bad email",           () -> p.setEmail("abc"));
        expectError("short phone",         () -> p.setPhoneNumber("123"));
        expectError("weak password",       () -> p.setPassword("abc"));
        expectError("wrong old password",  () -> p.changePassword("wrong", "NewPass99"));
    }

    private static void expectError(String testName, Runnable action) {
        try {
            action.run();
            System.out.println("FAIL (no error thrown): " + testName);
        } catch (IllegalArgumentException e) {
            System.out.println("OK (rejected): " + testName + " -> " + e.getMessage());
        }
    }
}
