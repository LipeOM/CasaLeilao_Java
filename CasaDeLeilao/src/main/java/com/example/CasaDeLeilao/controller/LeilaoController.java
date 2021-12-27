package com.example.CasaDeLeilao.controller;

import com.example.CasaDeLeilao.Mensagem;
import com.example.CasaDeLeilao.entities.Leilao;
import com.example.CasaDeLeilao.repositories.LeilaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("leilao")
public class LeilaoController {

    @Autowired
    private LeilaoRepository leilaoRepository;

    @GetMapping
    public List<Leilao> Listar(){
        List<Leilao> leilao = leilaoRepository.findAll();
        return leilao;
    }

    @GetMapping("/{id}")
    public Leilao buscar(@PathVariable int id){
        Leilao l = leilaoRepository.findById(id).get();
        return l;
    }

    @PostMapping
    public Mensagem incluir(@RequestBody Leilao l){
        l.setId(0);
        leilaoRepository.save(l);
        leilaoRepository.flush();

        Mensagem msg = new Mensagem();
        msg.setMensagem("Incluido com sucesso!");
        return msg;
    }

    @PutMapping
    public Mensagem alterar(@RequestBody Leilao l){
        leilaoRepository.save(l);
        leilaoRepository.flush();

        Mensagem msg = new Mensagem();
        msg.setMensagem("Alterado com sucesso!");
        return msg;
    }
}
