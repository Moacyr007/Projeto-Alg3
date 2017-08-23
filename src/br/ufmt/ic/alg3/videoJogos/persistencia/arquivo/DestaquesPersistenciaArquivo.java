package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class DestaquesPersistenciaArquivo
		        extends DestaquesPersistenciaLista
		        implements persistenciaDestaques {
		    private final String arq = 'Destaques.db';
		    public DestaquesPersistenciaArquivo(){
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
		    public void inserir(Destaques novoDestaques) {
		        super.inserir(novoDestaques);
		        gravar();
		    }
		    public void alterar(Destaques novoDestaques) {
		        super.alterar(novoDestaques);
		        gravar();
		    }
		    public void remover(Destaques novoDestaques) {
		        super.remover(novoDestaques);
		        gravar();
		    }
		}
	