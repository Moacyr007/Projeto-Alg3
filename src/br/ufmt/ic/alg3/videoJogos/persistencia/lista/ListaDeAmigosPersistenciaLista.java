
package PersistenciaLista;
import Entidades.ListaDeAmigos;
import Persistencia.persistenciaListaDeAmigos;
import java.util.ArrayList;
import java.util.List;
public class ListaDeAmigosPersistenciaLista 
        implements persistenciaListaDeAmigos {
    private List lista = new ArrayList();
    @Override
    public void inserir(ListaDeAmigos novoListaDeAmigos) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            ListaDeAmigos ultimo = (ListaDeAmigos) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoListaDeAmigos.setId(ultimoId + 1);
        lista.add(novoListaDeAmigos);
    }
    @Override
    public void alterar(ListaDeAmigos novoListaDeAmigos) {
        for (int i = 0; i < lista.size(); i++) {
            ListaDeAmigos elem = (ListaDeAmigos) lista.get(i);
            if(novoListaDeAmigos.getId() == elem.getId()){
                lista.set(i, novoListaDeAmigos);
            }
        }
    }
    @Override
    public void remover(ListaDeAmigos novoListaDeAmigos) {
          int posicao = 0;
        while (posicao < lista.size()) {
            ListaDeAmigos elemento = (ListaDeAmigos) lista.get(posicao);
            if (elemento.getId() == novoListaDeAmigos.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public ListaDeAmigos buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            ListaDeAmigos elem = (ListaDeAmigos) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<ListaDeAmigos> getAll(){
      return lista;
  }
 
}