
package PersistenciaLista;
import Entidades.JogosPorGenero;
import Persistencia.persistenciaJogosPorGenero;
import java.util.ArrayList;
import java.util.List;
public class JogosPorGeneroPersistenciaLista 
        implements persistenciaJogosPorGenero {
    private List lista = new ArrayList();
    @Override
    public void inserir(JogosPorGenero novoJogosPorGenero) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            JogosPorGenero ultimo = (JogosPorGenero) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoJogosPorGenero.setId(ultimoId + 1);
        lista.add(novoJogosPorGenero);
    }
    @Override
    public void alterar(JogosPorGenero novoJogosPorGenero) {
        for (int i = 0; i < lista.size(); i++) {
            JogosPorGenero elem = (JogosPorGenero) lista.get(i);
            if(novoJogosPorGenero.getId() == elem.getId()){
                lista.set(i, novoJogosPorGenero);
            }
        }
    }
    @Override
    public void remover(JogosPorGenero novoJogosPorGenero) {
          int posicao = 0;
        while (posicao < lista.size()) {
            JogosPorGenero elemento = (JogosPorGenero) lista.get(posicao);
            if (elemento.getId() == novoJogosPorGenero.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public JogosPorGenero buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            JogosPorGenero elem = (JogosPorGenero) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<JogosPorGenero> getAll(){
      return lista;
  }
 
}