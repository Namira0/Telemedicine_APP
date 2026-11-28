package com.example.telemedicine_app.nawrin;

import java.time.LocalTime;

public class ScheduleSession {
    private String dayOfWeek;
    private LocalTime startTime, endTime;
    private int slotDurationMinutes, maxPatients;

    public ScheduleSession(String dayOfWeek, LocalTime endTime, int maxPatients, int slotDurationMinutes, LocalTime startTime) {
        this.dayOfWeek = dayOfWeek;
        this.endTime = endTime;
        this.maxPatients = maxPatients;
        this.slotDurationMinutes = slotDurationMinutes;
        this.startTime = startTime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int getMaxPatients() {
        return maxPatients;
    }

    public void setMaxPatients(int maxPatients) {
        this.maxPatients = maxPatients;
    }

    public int getSlotDurationMinutes() {
        return slotDurationMinutes;
    }

    public void setSlotDurationMinutes(int slotDurationMinutes) {
        this.slotDurationMinutes = slotDurationMinutes;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "ScheduleSession{" +
                "dayOfWeek='" + dayOfWeek + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", slotDurationMinutes=" + slotDurationMinutes +
                ", maxPatients=" + maxPatients +
                '}';
    }
}
