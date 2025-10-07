package com.BusStop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BusStop.entity.Stop;

public interface StopRepository extends JpaRepository<Stop, Long> {

}
