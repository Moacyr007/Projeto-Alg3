
package PersistenciaLista;
import Entidades.Destaques;
import Persistencia.persistenciaDestaques;
import java.util.ArrayList;
import java.util.List;
public class DestaquesPersistenciaLista 
        implements persistenciaDestaques {
    private List lista = new ArrayList();
    @Override
    public void inserir(Destaques novoDestaques) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Destaques ultimo = (Destaques) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoDestaques.setId(ultimoId + 1);
        lista.add(novoDestaques);
    }
    @Override
    public void alterar(Destaques novoDestaques) {
        for (int i = 0; i < lista.size(); i++) {
            Destaques elem = (Destaques) lista.get(i);
            if(novoDestaques.getId() == elem.getId()){
                lista.set(i, novoDestaques);
            }
        }
    }
    @Override
    public void remover(Destaques novoDestaques) {
          int posicao = 0;
        while (posicao < lista.size()) {
            Destaques elemento = (Destaques) lista.get(posicao);
            if (elemento.getId() == novoDestaques.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public Destaques buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Destaques elem = (Destaques) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<Destaques> getAll(){
      return lista;
  }
 
}