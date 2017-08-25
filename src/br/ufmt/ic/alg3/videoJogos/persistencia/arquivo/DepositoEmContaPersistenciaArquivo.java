package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;
import br.ufmt.ic.alg3.videoJogos.model.entidades.DepositoEmConta;
import br.ufmt.ic.alg3.videoJogos.persistencia.DepositoEmContaPersistencia;
import br.ufmt.ic.alg3.videoJogos.persistencia.lista.DepositoEmContaPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class DepositoEmContaPersistenciaArquivo
        extends DepositoEmContaPersistenciaLista
        implements DepositoEmContaPersistencia {

    private final String arq = "DepositoEmConta.db";
    public DepositoEmContaPersistenciaArquivo(){
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
    public void inserir(DepositoEmConta novoDepositoEmConta) {
       super.inserir(novoDepositoEmConta);
        gravar();
    }
    public void alterar(DepositoEmConta novoDepositoEmConta) {
        super.alterar(novoDepositoEmConta);
        gravar();
    }
    public void remover(DepositoEmConta novoDepositoEmConta) {
        super.remover(novoDepositoEmConta);
        gravar();
    }
}
	