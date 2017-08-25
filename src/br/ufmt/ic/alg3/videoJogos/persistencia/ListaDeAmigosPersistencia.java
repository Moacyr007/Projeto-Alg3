/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.ListaDeAmigos;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface ListaDeAmigosPersistencia {
   
    public void inserir(ListaDeAmigos listaDeAmigos);
    
    public void alterar(ListaDeAmigos listaDeAmigos);
    
    public void remover(ListaDeAmigos listaDeAmigos);
    
    public ListaDeAmigos buscar(int id, String cpf, String nome);
    
    /**
     *
     * @return
     */
    public List<ListaDeAmigos> getAll();
    
    
}
