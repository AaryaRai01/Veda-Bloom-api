package com.vedabloom.api;

import java.time.LocalDate;

// This is a simple class to hold the data we send back to React
public class PredictionResponse {
    private LocalDate nextPeriodDate;
    private LocalDate fertileWindowStart;
    private LocalDate ovulationDate;

    public PredictionResponse(LocalDate nextPeriodDate, LocalDate fertileWindowStart, LocalDate ovulationDate) {
        this.nextPeriodDate = nextPeriodDate;
        this.fertileWindowStart = fertileWindowStart;
        this.ovulationDate = ovulationDate;
    }

    // Getters (needed for JSON conversion)
    public LocalDate getNextPeriodDate() { return nextPeriodDate; }
    public LocalDate getFertileWindowStart() { return fertileWindowStart; }
    public LocalDate getOvulationDate() { return ovulationDate; }
}