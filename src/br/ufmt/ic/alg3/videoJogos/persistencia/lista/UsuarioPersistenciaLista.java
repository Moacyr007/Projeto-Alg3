/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia.lista;

import br.ufmt.ic.alg3.videoJogos.persistencia.UsuarioPersistencia;
import br.ufmt.ic.alg3.videoJogos.model.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public class UsuarioPersistenciaLista
        implements UsuarioPersistencia {

    private List lista = new ArrayList();

    public void inserir(Usuario usuario) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Usuario ultimo = (Usuario) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        usuario.setId(ultimoId + 1);
        lista.add(usuario);
        System.out.println(lista.size());
    }

    public void alterar(Usuario usuario) {
        for (int i = 0; i < lista.size(); i++) {
            Usuario elem = (Usuario) lista.get(i);
            if(usuario.getId() == elem.getId()){
                lista.set(i, usuario);
            }
        }
    }

    public void remover(Usuario usuario) {
        int posicao = 0;

        while (posicao < lista.size()) {
            Usuario elemento = (Usuario) lista.get(posicao);
            if (elemento.getId() == usuario.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
    }


    public Usuario buscar(int id, String email, String nome) {
        for (int i = 0; i < lista.size(); i++) {
            Usuario elem = (Usuario) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
            if(elem.getEmail().equals(email)){
                return elem;
            }
            if(elem.getNome().equals(nome)){
                return elem;
            }
        }
        return null;
    }

    public List<Usuario> getAll(){
        return lista;
    }   
}
