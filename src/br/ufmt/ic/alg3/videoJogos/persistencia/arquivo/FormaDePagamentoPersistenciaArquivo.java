package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class FormaDePagamentoPersistenciaArquivo
		        extends FormaDePagamentoPersistenciaLista
		        implements persistenciaFormaDePagamento {
		    private final String arq = 'FormaDePagamento.db';
		    public FormaDePagamentoPersistenciaArquivo(){
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
		    public void inserir(FormaDePagamento novoFormaDePagamento) {
		        super.inserir(novoFormaDePagamento);
		        gravar();
		    }
		    public void alterar(FormaDePagamento novoFormaDePagamento) {
		        super.alterar(novoFormaDePagamento);
		        gravar();
		    }
		    public void remover(FormaDePagamento novoFormaDePagamento) {
		        super.remover(novoFormaDePagamento);
		        gravar();
		    }
		}
	