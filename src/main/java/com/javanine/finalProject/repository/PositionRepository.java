package com.javanine.finalProject.repository;

import com.javanine.finalProject.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long>{
    Position findByName(String name);
}
