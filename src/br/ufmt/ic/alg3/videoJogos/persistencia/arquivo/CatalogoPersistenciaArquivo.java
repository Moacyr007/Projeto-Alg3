package br.ufmt.ic.alg3.videoJogos.persistencia.arquivo;


    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class CatalogoPersistenciaArquivo
		        extends CatalogoPersistenciaLista
		        implements persistenciaCatalogo {
		    private final String arq = 'Catalogo.db';
		    public CatalogoPersistenciaArquivo(){
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
		    public void inserir(Catalogo novoCatalogo) {
		        super.inserir(novoCatalogo);
		        gravar();
		    }
		    public void alterar(Catalogo novoCatalogo) {
		        super.alterar(novoCatalogo);
		        gravar();
		    }
		    public void remover(Catalogo novoCatalogo) {
		        super.remover(novoCatalogo);
		        gravar();
		    }
		}
	