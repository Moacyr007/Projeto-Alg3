
package br.ufmt.ic.alg3.videoJogos.persistencia.lista;
import br.ufmt.ic.alg3.videoJogos.model.entidades.Biblioteca;
import br.ufmt.ic.alg3.videoJogos.persistencia.BibliotecaPersistencia;
import java.util.ArrayList;
import java.util.List;
public class BibliotecaPersistenciaLista 
        implements BibliotecaPersistencia {
    private List lista = new ArrayList();
    @Override
    public void inserir(Biblioteca novoBiblioteca) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Biblioteca ultimo = (Biblioteca) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoBiblioteca.setId(ultimoId + 1);
        lista.add(novoBiblioteca);
    }
    @Override
    public void alterar(Biblioteca novoBiblioteca) {
        for (int i = 0; i < lista.size(); i++) {
            Biblioteca elem = (Biblioteca) lista.get(i);
            if(novoBiblioteca.getId() == elem.getId()){
                lista.set(i, novoBiblioteca);
            }
        }
    }
    @Override
    public void remover(Biblioteca novoBiblioteca) {
          int posicao = 0;
        while (posicao < lista.size()) {
            Biblioteca elemento = (Biblioteca) lista.get(posicao);
            if (elemento.getId() == novoBiblioteca.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public Biblioteca buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Biblioteca elem = (Biblioteca) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<Biblioteca> getAll(){
      return lista;
  }
 
}