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
public class FormaDePagamento {
    
    private int id;
    private float valor;
    private CartaoDeCredito cartaoDeCredito;
    private DepositoEmConta depositoEmConta;
    private BoletoBancario boletoBancario;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CartaoDeCredito getCartaoDeCredito() {
        return cartaoDeCredito;
    }

    public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
        this.cartaoDeCredito = cartaoDeCredito;
    }

    public DepositoEmConta getDepositoEmConta() {
        return depositoEmConta;
    }

    public void setDepositoEmConta(DepositoEmConta depositoEmConta) {
        this.depositoEmConta = depositoEmConta;
    }

    public BoletoBancario getBoletoBancario() {
        return boletoBancario;
    }

    public void setBoletoBancario(BoletoBancario boletoBancario) {
        this.boletoBancario = boletoBancario;
    }
   

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
