package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class PromocaoPersistenciaArquivo
		        extends PromocaoPersistenciaLista
		        implements persistenciaPromocao {
		    private final String arq = 'Promocao.db';
		    public PromocaoPersistenciaArquivo(){
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
		    public void inserir(Promocao novoPromocao) {
		        super.inserir(novoPromocao);
		        gravar();
		    }
		    public void alterar(Promocao novoPromocao) {
		        super.alterar(novoPromocao);
		        gravar();
		    }
		    public void remover(Promocao novoPromocao) {
		        super.remover(novoPromocao);
		        gravar();
		    }
		}
	