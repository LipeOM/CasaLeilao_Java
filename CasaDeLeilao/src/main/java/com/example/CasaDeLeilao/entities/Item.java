package com.example.CasaDeLeilao.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nome")
    private String nome;
    @Column(name="seculo")
    private String seculo;
    @Column(name="cultura")
    private String cultura;
    @Column(name="valor")
    private BigDecimal valor;
    @Column(name="ativo")
    private Boolean ativo;
    @Column(name="idProprietario")
    private Integer idProprietario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSeculo() {
        return seculo;
    }

    public void setSeculo(String seculo) {
        this.seculo = seculo;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(Integer idProprietario) {
        this.idProprietario = idProprietario;
    }
}
