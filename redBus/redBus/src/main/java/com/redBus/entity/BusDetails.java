package com.redBus.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "bus_details", schema = "redbus")
public class BusDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "busId")
    private int busId;

    @Column(name = "source_Place")
    private String sourcePlace;

    @Column(name = "dest_Place")
    private String destinPlace;

    @Column(name = "bus_Name", nullable = false)
    private String busName;

    @Column(name = "bus_Brand")
    private String busBrand;

    @Column(name = "bus_Type")
    private String busType;

}
