package com.redBus.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusDto {

    private int busId;
    private String busName;
    private String busBrand;
    private String busType;
    private String sourcePlace;
    private String destinPlace;


}
