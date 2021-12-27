package com.example.CasaDeLeilao.controller;

import com.example.CasaDeLeilao.Mensagem;
import com.example.CasaDeLeilao.entities.Proprietario;
import com.example.CasaDeLeilao.repositories.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proprietario")
public class ProprietarioController {
    @Autowired
    private ProprietarioRepository proprietarioRepository;

    @GetMapping
    public List<Proprietario> listar () {
        List<Proprietario> lista = proprietarioRepository.findByAtivo(true);
        return lista;
    }

    @GetMapping("/{id}")
    public Proprietario buscar (@PathVariable int id) {
        Proprietario proprietario = proprietarioRepository.findById(id).get();
        return proprietario;
    }

    @PostMapping
    public Mensagem incluir (@RequestBody Proprietario proprietario) {
        proprietario.setId(0);
        proprietarioRepository.save(proprietario);
        proprietarioRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Incluido com sucesso");
        return msg;
    }

    @PutMapping
    public Mensagem alterar (@RequestBody Proprietario proprietario) {
        proprietarioRepository.save(proprietario);
        proprietarioRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Alterado com sucesso");
        return msg;
    }

    @DeleteMapping
    public Mensagem deletar (@RequestBody Proprietario proprietario) {
        proprietario.setAtivo(false);
        proprietarioRepository.save(proprietario);
        proprietarioRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Deletado com sucesso");
        return msg;
    }
}
