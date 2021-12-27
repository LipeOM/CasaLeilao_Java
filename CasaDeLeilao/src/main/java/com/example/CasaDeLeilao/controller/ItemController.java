package com.example.CasaDeLeilao.controller;

import com.example.CasaDeLeilao.Mensagem;
import com.example.CasaDeLeilao.entities.Item;
import com.example.CasaDeLeilao.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> listar () {
        List<Item> lista = itemRepository.findByAtivo(true);
        return lista;
    }

    @GetMapping("/{id}")
    public Item buscar (@PathVariable int id) {
        Item item = itemRepository.findById(id).get();
        return item;
    }

    @PostMapping
    public Mensagem incluir (@RequestBody Item item) {
        item.setId(0);
        itemRepository.save(item);
        itemRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Incluido com sucesso");
        return msg;
    }

    @PutMapping
    public Mensagem alterar (@RequestBody Item item) {
        itemRepository.save(item);
        itemRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Alterado com sucesso");
        return msg;
    }

    @DeleteMapping
    public Mensagem deletar (@RequestBody Item item) {
        item.setAtivo(false);
        itemRepository.save(item);
        itemRepository.flush();
        Mensagem msg = new Mensagem();
        msg.setMensagem("Deletado com sucesso");
        return msg;
    }
}
