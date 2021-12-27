package com.example.CasaDeLeilao.repositories;

import com.example.CasaDeLeilao.entities.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Integer> {
    List<Proprietario> findByAtivo(Boolean ativo);
}
