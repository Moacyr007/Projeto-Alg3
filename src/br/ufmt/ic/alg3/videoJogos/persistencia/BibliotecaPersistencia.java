/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Biblioteca;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface BibliotecaPersistencia {
    
    public void inserir(Biblioteca biblioteca);
    
    public void alterar(Biblioteca biblioteca);
    
    public void remover(Biblioteca biblioteca);
    
    public List<Biblioteca> getAll();
}
