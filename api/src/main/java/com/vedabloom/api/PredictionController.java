package com.vedabloom.api;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredictionController {

    @CrossOrigin(origins = {
        "http://localhost:3000",
        "https://veda-bloom.vercel.app",
        "https://veda-bloom-egmdl7scj-aarya-rais-projects.vercel.app"
    })
    @PostMapping("/api/predict")
    public PredictionResponse getPrediction(@RequestBody PredictionRequest request) {

        LocalDate lastPeriod = request.getLastPeriodDate();
        int cycleLength = request.getAverageCycleLength();

        LocalDate nextPeriodDate = lastPeriod.plusDays(cycleLength);
        LocalDate ovulationDate = nextPeriodDate.minusDays(14);
        LocalDate fertileWindowStart = ovulationDate.minusDays(5);

        System.out.println("Received request for: " + lastPeriod);
        System.out.println("Calculated next period: " + nextPeriodDate);

        return new PredictionResponse(nextPeriodDate, fertileWindowStart, ovulationDate);
    }
}
