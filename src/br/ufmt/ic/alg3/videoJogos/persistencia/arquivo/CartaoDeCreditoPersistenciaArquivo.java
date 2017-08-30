package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;

import br.ufmt.ic.alg3.videoJogos.model.entidades.CartaoDeCredito;
import br.ufmt.ic.alg3.videoJogos.persistencia.CartaoDeCreditoPersistencia;
import br.ufmt.ic.alg3.videoJogos.persistencia.lista.CartaoDeCreditoPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class CartaoDeCreditoPersistenciaArquivo
        extends CartaoDeCreditoPersistenciaLista
        implements CartaoDeCreditoPersistencia {

    private final String arq = "CartaoDeCredito.db";

    public CartaoDeCreditoPersistenciaArquivo() {
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
        } catch (FileNotFoundException arquivoNaoEncontrado) {
            gravar();

        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    private void gravar() {
        try {
            ObjectOutputStream oos;
            FileOutputStream fos;
            fos = new FileOutputStream(arq);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    public void inserir(CartaoDeCredito novoCartaoDeCredito) {
        super.inserir(novoCartaoDeCredito);
        gravar();
    }

    public void alterar(CartaoDeCredito novoCartaoDeCredito) {
        super.alterar(novoCartaoDeCredito);
        gravar();
    }

    public void remover(CartaoDeCredito novoCartaoDeCredito) {
        super.remover(novoCartaoDeCredito);
        gravar();
    }
}
