/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.DepositoEmConta;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface DepositoEmContaPersistencia {

    public void inserir(DepositoEmConta depositoEmConta);
    
    public void alterar(DepositoEmConta depositoEmConta);
    
    public void remover(DepositoEmConta depositoEmConta);
    
    public List<DepositoEmConta> getAll();
}    


