package com.aaron.businesscalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataService implements DataService {

    @Override
    public int[] retreiveData() {
        return new int[] {11, 22, 33, 44, 55};
    }
}
