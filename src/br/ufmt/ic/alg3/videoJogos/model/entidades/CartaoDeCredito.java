/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.model.entidades;

import java.io.Serializable;

/**
 *
 * @author Moacyr
 */
public class CartaoDeCredito extends FormaDePagamento implements Serializable{
    private int numCartao;
    private int dataEx; 
    private int codigoDeSeguranca;
    private int idUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getDataEx() {
        return dataEx;
    }

    public void setDataEx(int dataEx) {
        this.dataEx = dataEx;
    }

    /**
     * @return the numCartao
     */
    public int getNumCartao() {
        return numCartao;
    }

    /**
     * @param numCartao the numCartao to set
     */
    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    /**
     * @return the codigoDeSeguranca
     */
    public int getCodigoDeSeguranca() {
        return codigoDeSeguranca;
    }

    /**
     * @param codigoDeSeguranca the codigoDeSeguranca to set
     */
    public void setCodigoDeSeguranca(int codigoDeSeguranca) {
        this.codigoDeSeguranca = codigoDeSeguranca;
    }
    
    
}
        