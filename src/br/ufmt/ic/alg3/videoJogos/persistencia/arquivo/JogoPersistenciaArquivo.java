/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Jogo;
import br.ufmt.ic.alg3.videoJogos.persistencia.JogoPersistencia;
import br.ufmt.ic.alg3.videoJogos.persistencia.lista.JogoPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public class JogoPersistenciaArquivo 
        extends JogoPersistenciaLista 
        implements JogoPersistencia{
    
    private final String arq = "jogo.db";
    public JogoPersistenciaArquivo(){
        ler();
    }
    private void ler() {
        try {
            ObjectInputStream ois;
            FileInputStream fis;
            fis = new FileInputStream(arq);
            ois = new ObjectInputStream(fis);
            lista = (List) ois.readObject();
            ois.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
    private void gravar(){
        try{
            ObjectOutputStream oos;
            FileOutputStream fos;
            fos = new FileOutputStream(arq);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    public void inserir(Jogo jogo) {
        super.inserir(jogo);
        gravar();
    }
    public void alterar(Jogo jogo) {
        super.alterar(jogo);
        gravar();
    }
    public void remover(Jogo jogo) {
        super.remover(jogo);
        gravar();
    }
    
}
