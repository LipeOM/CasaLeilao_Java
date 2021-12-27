package com.example.CasaDeLeilao.entities;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="email")
    private String email;

    @Column(name="celular")
    private String celular;

    @Column(name="ativo")
    private Boolean ativo;

    @Column(name="nome")
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
