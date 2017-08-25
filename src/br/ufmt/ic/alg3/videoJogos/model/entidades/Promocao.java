/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.model.entidades;

/**
 *
 * @author Moacyr
 */
public class Promocao {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private float desconto;
    private int idJogo;

    /**
     * @return the idPromocao
     */
    
    /**
     * @return the desconto
     */
    public float getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the idJogo
     */
    public int getIdJogo() {
        return idJogo;
    }

    /**
     * @param idJogo the idJogo to set
     */
    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }
    
    
}
