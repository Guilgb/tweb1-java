package br.com.ifce.springtweb1.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pedido {
    @Id
    private Long id;
    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dateDaEntrega;
    private String urlProduto;
    private String ulrImagem;
    private String descricao;


    /**
     * @return String return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return BigDecimal return the valorNegociado
     */
    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    /**
     * @param valorNegociado the valorNegociado to set
     */
    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    /**
     * @return LocalDate return the dateDaEntrega
     */
    public LocalDate getDateDaEntrega() {
        return dateDaEntrega;
    }

    /**
     * @param dateDaEntrega the dateDaEntrega to set
     */
    public void setDateDaEntrega(LocalDate dateDaEntrega) {
        this.dateDaEntrega = dateDaEntrega;
    }

    /**
     * @return String return the urlProduto
     */
    public String getUrlProduto() {
        return urlProduto;
    }

    /**
     * @param urlProduto the urlProduto to set
     */
    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    /**
     * @return String return the ulrImagem
     */
    public String getUlrImagem() {
        return ulrImagem;
    }

    /**
     * @param ulrImagem the ulrImagem to set
     */
    public void setUlrImagem(String ulrImagem) {
        this.ulrImagem = ulrImagem;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

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

}