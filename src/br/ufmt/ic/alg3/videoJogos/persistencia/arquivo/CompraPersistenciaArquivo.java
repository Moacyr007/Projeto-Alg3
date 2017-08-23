
    	import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.ObjectInputStream;
		import java.io.ObjectOutputStream;
		import java.util.List;
		public class CompraPersistenciaArquivo
		        extends CompraPersistenciaLista
		        implements persistenciaCompra {
		    private final String arq = 'Compra.db';
		    public CompraPersistenciaArquivo(){
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
		    public void inserir(Compra novoCompra) {
		        super.inserir(novoCompra);
		        gravar();
		    }
		    public void alterar(Compra novoCompra) {
		        super.alterar(novoCompra);
		        gravar();
		    }
		    public void remover(Compra novoCompra) {
		        super.remover(novoCompra);
		        gravar();
		    }
		}
	