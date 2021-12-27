package com.example.CasaDeLeilao.controller;

import com.example.CasaDeLeilao.Mensagem;
import com.example.CasaDeLeilao.entities.Cliente;
import com.example.CasaDeLeilao.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> Lista(){

        List<Cliente> lista = clienteRepository.findByAtivo(true);
        return lista;
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable int id){
        Cliente c = clienteRepository.findById(id).get();
        return c;
    }

    @PostMapping
    public Mensagem incluir(@RequestBody Cliente cliente){

        cliente.setId(0);
        clienteRepository.save(cliente);
        clienteRepository.flush();

        Mensagem msg = new Mensagem();
        msg.setMensagem("Incluido com sucesso!");

        return msg;
    }

    @PutMapping
    public Mensagem alterar (@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        clienteRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Alterado com sucesso!");
        return msg;
    }

    @DeleteMapping
    public Mensagem deletar(@RequestBody Cliente cliente){

        cliente.setAtivo(false);
        clienteRepository.save(cliente);
        clienteRepository.flush();

        Mensagem msg = new Mensagem();
        msg.setMensagem("Deletado com sucesso!");

        return msg;
    }

}
