
package PersistenciaLista;
import Entidades.Compra;
import Persistencia.persistenciaCompra;
import java.util.ArrayList;
import java.util.List;
public class CompraPersistenciaLista 
        implements persistenciaCompra {
    private List lista = new ArrayList();
    @Override
    public void inserir(Compra novoCompra) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Compra ultimo = (Compra) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoCompra.setId(ultimoId + 1);
        lista.add(novoCompra);
    }
    @Override
    public void alterar(Compra novoCompra) {
        for (int i = 0; i < lista.size(); i++) {
            Compra elem = (Compra) lista.get(i);
            if(novoCompra.getId() == elem.getId()){
                lista.set(i, novoCompra);
            }
        }
    }
    @Override
    public void remover(Compra novoCompra) {
          int posicao = 0;
        while (posicao < lista.size()) {
            Compra elemento = (Compra) lista.get(posicao);
            if (elemento.getId() == novoCompra.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public Compra buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Compra elem = (Compra) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<Compra> getAll(){
      return lista;
  }
 
}