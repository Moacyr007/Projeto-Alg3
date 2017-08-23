
package PersistenciaLista;
import Entidades.DepositoEmConta;
import Persistencia.persistenciaDepositoEmConta;
import java.util.ArrayList;
import java.util.List;
public class DepositoEmContaPersistenciaLista 
        implements persistenciaDepositoEmConta {
    private List lista = new ArrayList();
    @Override
    public void inserir(DepositoEmConta novoDepositoEmConta) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            DepositoEmConta ultimo = (DepositoEmConta) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoDepositoEmConta.setId(ultimoId + 1);
        lista.add(novoDepositoEmConta);
    }
    @Override
    public void alterar(DepositoEmConta novoDepositoEmConta) {
        for (int i = 0; i < lista.size(); i++) {
            DepositoEmConta elem = (DepositoEmConta) lista.get(i);
            if(novoDepositoEmConta.getId() == elem.getId()){
                lista.set(i, novoDepositoEmConta);
            }
        }
    }
    @Override
    public void remover(DepositoEmConta novoDepositoEmConta) {
          int posicao = 0;
        while (posicao < lista.size()) {
            DepositoEmConta elemento = (DepositoEmConta) lista.get(posicao);
            if (elemento.getId() == novoDepositoEmConta.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public DepositoEmConta buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            DepositoEmConta elem = (DepositoEmConta) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<DepositoEmConta> getAll(){
      return lista;
  }
 
}