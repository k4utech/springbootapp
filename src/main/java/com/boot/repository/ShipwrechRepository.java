package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Shipwreck;

public interface ShipwrechRepository extends JpaRepository<Shipwreck, Long>{

}
