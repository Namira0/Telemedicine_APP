package com.example.telemedicine_app.nawrin;

import java.time.LocalDate;
import java.util.ArrayList;

public class AvailabilitySchedule {

    private boolean published;
    private ArrayList<ScheduleSession> sessions;
    private ArrayList<LocalDate> unavailableDates;

    public AvailabilitySchedule(boolean published, ArrayList<ScheduleSession> sessions, ArrayList<LocalDate> unavailableDates) {
        this.published = published;
        this.sessions = sessions;
        this.unavailableDates = unavailableDates;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public ArrayList<ScheduleSession> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<ScheduleSession> sessions) {
        this.sessions = sessions;
    }

    public ArrayList<LocalDate> getUnavailableDates() {
        return unavailableDates;
    }

    @Override
    public String toString() {
        return "AvailabilitySchedule{" +
                "published=" + published +
                ", sessions=" + sessions +
                ", unavailableDates=" + unavailableDates +
                '}';
    }

    public void setUnavailableDates(ArrayList<LocalDate> unavailableDates) {
        this.unavailableDates = unavailableDates;
    }







}
