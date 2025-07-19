package com.redBus.service;

import com.redBus.dto.BusDto;
import com.redBus.entity.BusDetails;


public interface BusService {
   public BusDetails saveData(BusDto busDto);
   public BusDetails fetchData(int busId);


   public BusDetails deleteData(BusDto busDto);


}
