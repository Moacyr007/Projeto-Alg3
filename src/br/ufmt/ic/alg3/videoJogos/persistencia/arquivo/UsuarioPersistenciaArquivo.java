/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Usuario;
import br.ufmt.ic.alg3.videoJogos.persistencia.UsuarioPersistencia;
import br.ufmt.ic.alg3.videoJogos.persistencia.lista.UsuarioPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public class UsuarioPersistenciaArquivo 
            extends UsuarioPersistenciaLista 
            implements UsuarioPersistencia{
    
    private final String arq = "usuario.db";
    public UsuarioPersistenciaArquivo(){
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
    public void inserir(Usuario usuario) {
        super.inserir(usuario);
        gravar();
    }
    public void alterar(Usuario usuario) {
        super.alterar(usuario);
        gravar();
    }
    public void remover(Usuario usuario) {
        super.remover(usuario);
        gravar();
    }
}
