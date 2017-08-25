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
public class DepositoEmConta extends FormaDePagamento{
    
    private int id;//id da transação 
    private int numContaOrigem;
    private int numAgenciaOrigem;
    private int numContaDestino;
    private int numAgenciaDestino;
    private float valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the numContaOrigem
     */
    public int getNumContaOrigem() {
        return numContaOrigem;
    }

    /**
     * @param numContaOrigem the numContaOrigem to set
     */
    public void setNumContaOrigem(int numContaOrigem) {
        this.numContaOrigem = numContaOrigem;
    }

    /**
     * @return the numAgenciaOrigem
     */
    public int getNumAgenciaOrigem() {
        return numAgenciaOrigem;
    }

    /**
     * @param numAgenciaOrigem the numAgenciaOrigem to set
     */
    public void setNumAgenciaOrigem(int numAgenciaOrigem) {
        this.numAgenciaOrigem = numAgenciaOrigem;
    }

    /**
     * @return the numContaDestino
     */
    public int getNumContaDestino() {
        return numContaDestino;
    }

    /**
     * @param numContaDestino the numContaDestino to set
     */
    public void setNumContaDestino(int numContaDestino) {
        this.numContaDestino = numContaDestino;
    }

    /**
     * @return the numAgenciaDestino
     */
    public int getNumAgenciaDestino() {
        return numAgenciaDestino;
    }

    /**
     * @param numAgenciaDestino the numAgenciaDestino to set
     */
    public void setNumAgenciaDestino(int numAgenciaDestino) {
        this.numAgenciaDestino = numAgenciaDestino;
    }
    
    
}
