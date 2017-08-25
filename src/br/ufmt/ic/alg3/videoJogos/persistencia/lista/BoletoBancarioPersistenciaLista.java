
package br.ufmt.ic.alg3.videoJogos.persistencia.lista;
import br.ufmt.ic.alg3.videoJogos.model.entidades.BoletoBancario;
import br.ufmt.ic.alg3.videoJogos.persistencia.BoletoBancarioPersistencia;
import java.util.ArrayList;
import java.util.List;
public class BoletoBancarioPersistenciaLista 
        implements BoletoBancarioPersistencia {
        
    protected List lista = new ArrayList();
    
    @Override
    public void inserir(BoletoBancario novoBoletoBancario) {
    int ultimonumeroBoleto = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            BoletoBancario ultimo = (BoletoBancario) lista.get(posicaoUltimo);
            ultimonumeroBoleto = ultimo.getNumeroBoleto();
        }   
        novoBoletoBancario.setNumeroBoleto(ultimonumeroBoleto + 1);
        lista.add(novoBoletoBancario);
    }
    @Override
    public void alterar(BoletoBancario novoBoletoBancario) {
        for (int i = 0; i < lista.size(); i++) {
            BoletoBancario elem = (BoletoBancario) lista.get(i);
            if(novoBoletoBancario.getNumeroBoleto() == elem.getNumeroBoleto()){
                lista.set(i, novoBoletoBancario);
            }
        }
    }
    @Override
    public void remover(BoletoBancario novoBoletoBancario) {
          int posicao = 0;
        while (posicao < lista.size()) {
            BoletoBancario elemento = (BoletoBancario) lista.get(posicao);
            if (elemento.getNumeroBoleto() == novoBoletoBancario.getNumeroBoleto()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    public BoletoBancario buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            BoletoBancario elem = (BoletoBancario) lista.get(i);
            if(elem.getNumeroBoleto() == id){
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