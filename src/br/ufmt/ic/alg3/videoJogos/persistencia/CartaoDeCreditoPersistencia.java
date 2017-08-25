/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.CartaoDeCredito;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface CartaoDeCreditoPersistencia {
    
    public void inserir(CartaoDeCredito cartaoDeCredito);
    
    public void alterar(CartaoDeCredito cartaoDeCredito);
    
    public void remover(CartaoDeCredito cartaoDeCredito);
    
    public List<CartaoDeCredito> getAll();
}   

