package com.ifce.br.filmesspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String nome;
    private String duracao;
    private String valor;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the duraçao
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * @param duraçao the duraçao to set
     */
    public void setDuraçao(String duracao) {
        this.duracao = duracao;
    }

    /**
     * @return String return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

}
