
package PersistenciaLista;
import Entidades.BoletoBancario;
import Persistencia.persistenciaBoletoBancario;
import br.ufmt.ic.alg3.videoJogos.persistencia.BoletoBancarioPersistencia;
import java.util.ArrayList;
import java.util.List;
public class BoletoBancarioPersistenciaLista 
        implements BoletoBancarioPersistencia {
    private List lista = new ArrayList();
    @Override
    public void inserir(BoletoBancario novoBoletoBancario) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            BoletoBancario ultimo = (BoletoBancario) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoBoletoBancario.setId(ultimoId + 1);
        lista.add(novoBoletoBancario);
    }
    @Override
    public void alterar(BoletoBancario novoBoletoBancario) {
        for (int i = 0; i < lista.size(); i++) {
            BoletoBancario elem = (BoletoBancario) lista.get(i);
            if(novoBoletoBancario.getId() == elem.getId()){
                lista.set(i, novoBoletoBancario);
            }
        }
    }
    @Override
    public void remover(BoletoBancario novoBoletoBancario) {
          int posicao = 0;
        while (posicao < lista.size()) {
            BoletoBancario elemento = (BoletoBancario) lista.get(posicao);
            if (elemento.getId() == novoBoletoBancario.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public BoletoBancario buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            BoletoBancario elem = (BoletoBancario) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<BoletoBancario> getAll(){
      return lista;
  }
 
}