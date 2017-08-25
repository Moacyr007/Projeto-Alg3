/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.FormaDePagamento;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface FormaDePagamentoPersistencia {
    
    public void inserir(FormaDePagamento formaDePagamento);
    
    public void alterar(FormaDePagamento formaDePagamento);
    
    public void remover(FormaDePagamento formaDePagamento);
    
    public List<FormaDePagamento> getAll();   
}
