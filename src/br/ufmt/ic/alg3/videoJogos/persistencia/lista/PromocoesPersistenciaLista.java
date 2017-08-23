
package PersistenciaLista;
import Entidades.Promocoes;
import Persistencia.persistenciaPromocoes;
import java.util.ArrayList;
import java.util.List;
public class PromocoesPersistenciaLista 
        implements persistenciaPromocoes {
    private List lista = new ArrayList();
    @Override
    public void inserir(Promocoes novoPromocoes) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Promocoes ultimo = (Promocoes) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoPromocoes.setId(ultimoId + 1);
        lista.add(novoPromocoes);
    }
    @Override
    public void alterar(Promocoes novoPromocoes) {
        for (int i = 0; i < lista.size(); i++) {
            Promocoes elem = (Promocoes) lista.get(i);
            if(novoPromocoes.getId() == elem.getId()){
                lista.set(i, novoPromocoes);
            }
        }
    }
    @Override
    public void remover(Promocoes novoPromocoes) {
          int posicao = 0;
        while (posicao < lista.size()) {
            Promocoes elemento = (Promocoes) lista.get(posicao);
            if (elemento.getId() == novoPromocoes.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public Promocoes buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Promocoes elem = (Promocoes) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<Promocoes> getAll(){
      return lista;
  }
 
}