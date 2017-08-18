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
public class CartaoDeCredito {
    private int numCartao;
    private int dataEx; 
    private int codigoDeSeguranca;

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
