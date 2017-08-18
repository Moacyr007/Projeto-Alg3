/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia.lista;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Jogo;
import br.ufmt.ic.alg3.videoJogos.persistencia.JogoPersistencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public class JogoPersistenciaLista
        implements JogoPersistencia {

    private List lista = new ArrayList();

    
    public void inserir(Jogo jogo) {
        int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Jogo ultimo = (Jogo) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }

        jogo.setId(ultimoId + 1);
        lista.add(jogo);
        System.out.println(lista.size());
    }

    
    public void alterar(Jogo jogo) {
        for (int i = 0; i < lista.size(); i++) {
            Jogo elem = (Jogo) lista.get(i);
            if(jogo.getId() == elem.getId()){
                lista.set(i, jogo);
            }
        }
    }

    
    public void remover(Jogo jogo) {
        int posicao = 0;

        while (posicao < lista.size()) {
            Jogo elemento = (Jogo) lista.get(posicao);
            if (elemento.getId() == jogo.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }

        System.out.println(lista.size());
    }


    public Jogo buscar(int id, String desenvolvedor, String nome) {
        for (int i = 0; i < lista.size(); i++) {
            Jogo elem = (Jogo) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
            if(elem.getDesenvolvedor().equals(desenvolvedor)){
                return elem;
            }
            if(elem.getNome().equals(nome)){
                return elem;
            }
        }
        return null;
    }

    
    public List<Jogo> getAll(){
        return lista;
    }
}

