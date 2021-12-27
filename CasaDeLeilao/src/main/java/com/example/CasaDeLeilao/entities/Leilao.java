package com.example.CasaDeLeilao.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="leilao")
public class Leilao {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="data_abertura")
    private java.sql.Date dataAbertura;

    @Column(name="data_fechamento")
    private java.sql.Date dataFechamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
}
