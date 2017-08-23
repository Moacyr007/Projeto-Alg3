package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class JogoPorGeneroPersistenciaArquivo
		        extends JogoPorGeneroPersistenciaLista
		        implements persistenciaJogoPorGenero {
		    private final String arq = 'JogoPorGenero.db';
		    public JogoPorGeneroPersistenciaArquivo(){
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
		    public void inserir(JogoPorGenero novoJogoPorGenero) {
		        super.inserir(novoJogoPorGenero);
		        gravar();
		    }
		    public void alterar(JogoPorGenero novoJogoPorGenero) {
		        super.alterar(novoJogoPorGenero);
		        gravar();
		    }
		    public void remover(JogoPorGenero novoJogoPorGenero) {
		        super.remover(novoJogoPorGenero);
		        gravar();
		    }
		}
	