package com.example.CasaDeLeilao.controller;

import com.example.CasaDeLeilao.Mensagem;
import com.example.CasaDeLeilao.entities.Lance;
import com.example.CasaDeLeilao.repositories.LanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lance")
public class LanceController {
    @Autowired
    private LanceRepository lanceRepository;

    @GetMapping
    public List<Lance> listar () {
        List<Lance> lista = lanceRepository.findAll();
        return lista;
    }

    @GetMapping("/{id}")
    public Lance buscar (@PathVariable int id) {
        Lance lance = lanceRepository.findById(id).get();
        return lance;
    }

    @PostMapping
    public Mensagem incluir (@RequestBody Lance lance) {
        lance.setId(0);
        lanceRepository.save(lance);
        lanceRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Incluido com sucesso");
        return msg;
    }

    @PutMapping
    public Mensagem alterar (@RequestBody Lance lance) {
        lanceRepository.save(lance);
        lanceRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Alterado com sucesso");
        return msg;
    }
}
