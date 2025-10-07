package com.BusStop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BusStop.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

}
