package com.example.CasaDeLeilao.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="lance")
public class Lance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="valor")
    private BigDecimal valor;
    @Column(name="resultado")
    private Boolean resultado;
    @Column(name="idCliente")
    private Integer idCliente;
    @Column(name="idItem")
    private Integer idItem;
    @Column(name="idLeilao")
    private Integer idLeilao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public Integer getIdLeilao() {
        return idLeilao;
    }

    public void setIdLeilao(Integer idLeilao) {
        this.idLeilao = idLeilao;
    }
}
