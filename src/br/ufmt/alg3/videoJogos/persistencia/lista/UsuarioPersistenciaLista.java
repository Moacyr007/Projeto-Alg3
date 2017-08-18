/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.alg3.videoJogos.persistencia.lista;

import br.ufmt.alg3.videoJogos.persistencia.UsuarioPersistencia;
import br.ufmt.ic.alg3.videoJogos.model.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public class UsuarioPersistenciaLista 
        implements UsuarioPersistencia{
    
     private List lista = new ArrayList();

    @Override
    public void inserir(Usuario usuario) {
        int ultimoId = 0;
        if (lista.size()>0){
        int posicaoUltimo = lista.size() - 1;
        Usuario ultimo = (Usuario) lista.get(posicaoUltimo);
        ultimoId = ultimo.getId();
        }
        
        usuario.setId(ultimoId +1);      
        lista.add(usuario);
        System.out.println(lista.size());
    }

    @Override
    public void alterar(Usuario usuario) {
     /* for (int i=0; i<lista.size(); i++){
            Usuario elem = (Usuario) lista.get(i);
            if (usuario.getId()) == elem.getId()){
            if ()
        }
        
        }*/    
        
    
    }

    @Override
    public void remover(Usuario usuario) {
        
      int posicao = 0;    
        while(posicao < lista.size()){
            Usuario elemento = (Usuario) lista.get(posicao);
            if (elemento.getId() == usuario.getId()){
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
        for (int i = 0; i < lista.size(); i++){
        
        }
        
        
        System.out.println(lista.size());
    }

    @Override
    public Usuario buscar(int id, String cpf, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
/*
    @Override
    public Usuario buscar(int id, String cpf, String nome) {

    for (int i = 0; i < lista.size(); i++){
            Usuario elem = (Usuario) lista.get(i);
            if (elem.getId() == id){
                return elem;
            }
            if (elem.getCpf().equals(cpf)){
                return elem;           
            }
            if (elem.getNome().equals(nome)){
                return elem;
            }
        }
        return null;
    }
    
    }

}
*/
