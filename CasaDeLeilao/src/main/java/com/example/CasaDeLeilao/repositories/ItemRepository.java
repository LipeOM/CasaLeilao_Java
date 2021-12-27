package com.example.CasaDeLeilao.repositories;

import com.example.CasaDeLeilao.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findByAtivo(Boolean ativo);
}
