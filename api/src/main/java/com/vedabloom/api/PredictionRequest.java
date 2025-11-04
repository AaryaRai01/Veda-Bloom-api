package com.vedabloom.api;

import java.time.LocalDate;

// This is a simple class to hold the incoming data from React
public class PredictionRequest {
    private LocalDate lastPeriodDate;
    private int averageCycleLength;

    // Getters and Setters (needed for JSON conversion)
    public LocalDate getLastPeriodDate() {
        return lastPeriodDate;
    }
    public void setLastPeriodDate(LocalDate lastPeriodDate) {
        this.lastPeriodDate = lastPeriodDate;
    }
    public int getAverageCycleLength() {
        return averageCycleLength;
    }
    public void setAverageCycleLength(int averageCycleLength) {
        this.averageCycleLength = averageCycleLength;
    }
}