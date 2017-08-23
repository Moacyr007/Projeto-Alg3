
package PersistenciaLista;
import Entidades.Catalogo;
import Persistencia.persistenciaCatalogo;
import java.util.ArrayList;
import java.util.List;
public class CatalogoPersistenciaLista 
        implements persistenciaCatalogo {
    private List lista = new ArrayList();
    @Override
    public void inserir(Catalogo novoCatalogo) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Catalogo ultimo = (Catalogo) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoCatalogo.setId(ultimoId + 1);
        lista.add(novoCatalogo);
    }
    @Override
    public void alterar(Catalogo novoCatalogo) {
        for (int i = 0; i < lista.size(); i++) {
            Catalogo elem = (Catalogo) lista.get(i);
            if(novoCatalogo.getId() == elem.getId()){
                lista.set(i, novoCatalogo);
            }
        }
    }
    @Override
    public void remover(Catalogo novoCatalogo) {
          int posicao = 0;
        while (posicao < lista.size()) {
            Catalogo elemento = (Catalogo) lista.get(posicao);
            if (elemento.getId() == novoCatalogo.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public Catalogo buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Catalogo elem = (Catalogo) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<Catalogo> getAll(){
      return lista;
  }
 
}