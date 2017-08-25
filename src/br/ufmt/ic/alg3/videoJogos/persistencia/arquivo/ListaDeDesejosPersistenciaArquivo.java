package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


import br.ufmt.ic.alg3.videoJogos.model.entidades.ListaDeDesejos;
import br.ufmt.ic.alg3.videoJogos.persistencia.ListaDeDesejosPersistencia;
import br.ufmt.ic.alg3.videoJogos.persistencia.lista.ListaDeDesejosPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ListaDeDesejosPersistenciaArquivo
        extends ListaDeDesejosPersistenciaLista
        implements ListaDeDesejosPersistencia {

    private final String arq = "ListaDeDesejos.db";
    public ListaDeDesejosPersistenciaArquivo(){
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
    @Override
    public void inserir(ListaDeDesejos novoListaDeDesejos) {
        super.inserir(novoListaDeDesejos);
        gravar();
    }
    @Override
    public void alterar(ListaDeDesejos novoListaDeDesejos) {
        super.alterar(novoListaDeDesejos);
        gravar();
    }
    @Override
    public void remover(ListaDeDesejos novoListaDeDesejos) {
        super.remover(novoListaDeDesejos);
        gravar();
    }
}
	