/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Destaques;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface DestaquesPersistencia {

    public void inserir(Destaques destaques);
    
    public void alterar(Destaques destaques);
    
    public void remover(Destaques destaques);
    
    public List<Destaques> getAll();
}    
