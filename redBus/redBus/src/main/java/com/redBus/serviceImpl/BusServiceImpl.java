package com.redBus.serviceImpl;


import com.redBus.dto.BusDto;
import com.redBus.entity.BusDetails;
import com.redBus.repository.BusRepository;
import com.redBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService{


    @Autowired
    BusRepository busRepository;

    @Override
    public BusDetails saveData(BusDto busDto) {

        // Saving the bus details
        BusDetails busDetails = new BusDetails();
        busDetails.setBusName(busDto.getBusName());
        busDetails.setBusBrand(busDto.getBusBrand());
        busDetails.setBusType(busDto.getBusType());
        busDetails.setSourcePlace(busDto.getSourcePlace());
        busDetails.setDestinPlace(busDto.getDestinPlace());

         busRepository.save(busDetails);
        return busDetails;
    }

    @Override
    public BusDetails fetchData(int busId) {
            BusDetails busDetails;
            busDetails = busRepository.getReferenceById(busId);
            return busDetails;
    }


    @Override
    public BusDetails deleteData(BusDto busDto) {
        return null;
    }
}
