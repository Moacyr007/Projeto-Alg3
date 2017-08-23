package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class ListaDeAmigosPersistenciaArquivo
		        extends ListaDeAmigosPersistenciaLista
		        implements persistenciaListaDeAmigos {
		    private final String arq = 'ListaDeAmigos.db';
		    public ListaDeAmigosPersistenciaArquivo(){
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
		    public void inserir(ListaDeAmigos novoListaDeAmigos) {
		        super.inserir(novoListaDeAmigos);
		        gravar();
		    }
		    public void alterar(ListaDeAmigos novoListaDeAmigos) {
		        super.alterar(novoListaDeAmigos);
		        gravar();
		    }
		    public void remover(ListaDeAmigos novoListaDeAmigos) {
		        super.remover(novoListaDeAmigos);
		        gravar();
		    }
		}
	