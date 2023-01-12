package com.aaron.businesscalculation;

import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationService {
    DataService dataService;

    public BusinessCalculationService(DataService dataService){
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.retreiveData()).max().orElse(0);
    }
}
