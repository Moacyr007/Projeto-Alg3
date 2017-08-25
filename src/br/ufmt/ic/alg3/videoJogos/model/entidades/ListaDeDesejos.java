/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.model.entidades;

import java.util.ArrayList;

/**
 *
 * @author Moacyr
 */
public class ListaDeDesejos {
    private int id;
    private int idUsuario;
    private ArrayList jogos; //a ideia é cirar uma lista de jogos que o usuário deseja

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList jogos) {
        this.jogos = jogos;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
