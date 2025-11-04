package com.vedabloom.api;

// Here is the Java Date/Time library you wanted!
import java.time.LocalDate; 

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredictionController {

    // This allows your React app (on localhost:3000) to call this server
    @CrossOrigin(origins = "http://localhost:3000") 
    @PostMapping("/api/predict")
    public PredictionResponse getPrediction(@RequestBody PredictionRequest request) {
        
        // --- THIS IS YOUR JAVA PREDICTION LOGIC ---
        
        LocalDate lastPeriod = request.getLastPeriodDate();
        int cycleLength = request.getAverageCycleLength();

        // 1. Calculate next period date using java.time
        LocalDate nextPeriodDate = lastPeriod.plusDays(cycleLength);
        
        // 2. Calculate ovulation (approx. 14 days *before* next period)
        LocalDate ovulationDate = nextPeriodDate.minusDays(14);
        
        // 3. Calculate fertile window (approx. 5 days before ovulation)
        LocalDate fertileWindowStart = ovulationDate.minusDays(5);
        
        // --- END OF JAVA LOGIC ---

        // Log to the Java console
        System.out.println("Received request for: " + lastPeriod);
        System.out.println("Calculated next period: " + nextPeriodDate);

        // Send the response back to React
        return new PredictionResponse(nextPeriodDate, fertileWindowStart, ovulationDate);
    }
}