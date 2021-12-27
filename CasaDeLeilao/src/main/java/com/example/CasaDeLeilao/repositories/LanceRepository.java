package com.example.CasaDeLeilao.repositories;

import com.example.CasaDeLeilao.entities.Lance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanceRepository extends JpaRepository<Lance, Integer> {
}
