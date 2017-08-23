
package PersistenciaLista;
import Entidades.ListaDeDesejos;
import Persistencia.persistenciaListaDeDesejos;
import java.util.ArrayList;
import java.util.List;
public class ListaDeDesejosPersistenciaLista 
        implements persistenciaListaDeDesejos {
    private List lista = new ArrayList();
    @Override
    public void inserir(ListaDeDesejos novoListaDeDesejos) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            ListaDeDesejos ultimo = (ListaDeDesejos) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoListaDeDesejos.setId(ultimoId + 1);
        lista.add(novoListaDeDesejos);
    }
    @Override
    public void alterar(ListaDeDesejos novoListaDeDesejos) {
        for (int i = 0; i < lista.size(); i++) {
            ListaDeDesejos elem = (ListaDeDesejos) lista.get(i);
            if(novoListaDeDesejos.getId() == elem.getId()){
                lista.set(i, novoListaDeDesejos);
            }
        }
    }
    @Override
    public void remover(ListaDeDesejos novoListaDeDesejos) {
          int posicao = 0;
        while (posicao < lista.size()) {
            ListaDeDesejos elemento = (ListaDeDesejos) lista.get(posicao);
            if (elemento.getId() == novoListaDeDesejos.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public ListaDeDesejos buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            ListaDeDesejos elem = (ListaDeDesejos) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<ListaDeDesejos> getAll(){
      return lista;
  }
 
}