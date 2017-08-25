
package br.ufmt.ic.alg3.videoJogos.persistencia.lista;
import br.ufmt.ic.alg3.videoJogos.model.entidades.Biblioteca;
import br.ufmt.ic.alg3.videoJogos.persistencia.BibliotecaPersistencia;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaPersistenciaLista 
        implements BibliotecaPersistencia {
    public List lista = new ArrayList();
    
    public void inserir(Biblioteca biblioteca) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Biblioteca ultimo = (Biblioteca) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        biblioteca.setId(ultimoId + 1);
        lista.add(biblioteca);
    }
    public void alterar(Biblioteca biblioteca) {
        for (int i = 0; i < lista.size(); i++) {
            Biblioteca elem = (Biblioteca) lista.get(i);
            if(biblioteca.getId() == elem.getId()){
                lista.set(i, biblioteca);
            }
        }
    }
    public void remover(Biblioteca biblioteca) {
          int posicao = 0;
        while (posicao < lista.size()) {
            Biblioteca elemento = (Biblioteca) lista.get(posicao);
            if (elemento.getId() == biblioteca.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

 
    @Override
  public List<Biblioteca> getAll(){
      return lista;
  }

}