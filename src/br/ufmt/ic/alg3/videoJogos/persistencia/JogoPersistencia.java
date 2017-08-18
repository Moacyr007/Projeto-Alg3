/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Jogo;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface JogoPersistencia {  
    
    public void inserir(Jogo jogo);
    
    public void alterar(Jogo jogo);
    
    public void remover(Jogo jogo);
    
    public Jogo buscar(int id, String cpf, String nome);
    
    public List<Jogo> getAll();
}


