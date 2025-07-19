package com.redBus.repository;

import com.redBus.entity.BusDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<BusDetails, Integer> {

}
