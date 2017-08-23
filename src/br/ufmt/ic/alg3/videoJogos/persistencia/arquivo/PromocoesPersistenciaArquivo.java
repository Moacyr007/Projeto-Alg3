package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class PromocoesPersistenciaArquivo
		        extends PromocoesPersistenciaLista
		        implements persistenciaPromocoes {
		    private final String arq = 'Promocoes.db';
		    public PromocoesPersistenciaArquivo(){
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
		    public void inserir(Promocoes novoPromocoes) {
		        super.inserir(novoPromocoes);
		        gravar();
		    }
		    public void alterar(Promocoes novoPromocoes) {
		        super.alterar(novoPromocoes);
		        gravar();
		    }
		    public void remover(Promocoes novoPromocoes) {
		        super.remover(novoPromocoes);
		        gravar();
		    }
		}
	