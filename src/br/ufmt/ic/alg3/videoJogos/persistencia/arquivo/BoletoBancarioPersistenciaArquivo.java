package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class BoletoBancarioPersistenciaArquivo
		        extends BoletoBancarioPersistenciaLista
		        implements persistenciaBoletoBancario {
		    private final String arq = 'BoletoBancario.db';
		    public BoletoBancarioPersistenciaArquivo(){
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
		    public void inserir(BoletoBancario novoBoletoBancario) {
		        super.inserir(novoBoletoBancario);
		        gravar();
		    }
		    public void alterar(BoletoBancario novoBoletoBancario) {
		        super.alterar(novoBoletoBancario);
		        gravar();
		    }
		    public void remover(BoletoBancario novoBoletoBancario) {
		        super.remover(novoBoletoBancario);
		        gravar();
		    }
		}
	