/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Usuario;

/**
 *
 * @author Moacyr
 */
public interface UsuarioPersistencia {
    
    public void inserir(Usuario usuario);
    
    public void alterar(Usuario usuario);
    
    public void remover(Usuario usuario);
    
    public Usuario buscar(int id, String cpf, String nome);
    
    
    
}
