package com.aaron.businesscalculation;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    DataService dataService;

    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.retreiveData()).max().orElse(0);
    }
}
