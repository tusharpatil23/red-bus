package com.redBus.controller;

import com.redBus.dto.BusDto;
import com.redBus.entity.BusDetails;
import com.redBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/busController")
public class BusController {

    @Autowired
    BusService busService;

    @PostMapping("/saveBusData")
    public ResponseEntity<BusDetails> saveBusData(@RequestBody BusDto busDto){

        if (busDto == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        BusDetails busDetails = busService.saveData(busDto);
        return new ResponseEntity<>(busDetails,HttpStatus.OK);
    }

    @GetMapping("/getBusById/{busId}")
    public ResponseEntity<BusDetails> getBusById(@PathVariable int busId){

        BusDetails busDetails = busService.fetchData(busId);
        return new ResponseEntity<>(busDetails,HttpStatus.OK);
    }
}
