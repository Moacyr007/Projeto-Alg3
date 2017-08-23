package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class BibliotecaPersistenciaArquivo
		        extends BibliotecaPersistenciaLista
		        implements persistenciaBiblioteca {
		    private final String arq = 'Biblioteca.db';
		    public BibliotecaPersistenciaArquivo(){
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
		    public void inserir(Biblioteca novoBiblioteca) {
		        super.inserir(novoBiblioteca);
		        gravar();
		    }
		    public void alterar(Biblioteca novoBiblioteca) {
		        super.alterar(novoBiblioteca);
		        gravar();
		    }
		    public void remover(Biblioteca novoBiblioteca) {
		        super.remover(novoBiblioteca);
		        gravar();
		    }
		}
	