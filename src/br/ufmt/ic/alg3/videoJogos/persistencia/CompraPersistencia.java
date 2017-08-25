/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Compra;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface CompraPersistencia {
     public void inserir(Compra compra);
    
    public void alterar(Compra compra);
    
    public void remover(Compra compra);
    
   // public Compra buscar(int id, String cpf, String nome); Arrumar isso aqui, usar IDCOmpra pra pesquisar?
    
    /**
     *
     * @return
     */
    public List<Compra> getAll();
}
