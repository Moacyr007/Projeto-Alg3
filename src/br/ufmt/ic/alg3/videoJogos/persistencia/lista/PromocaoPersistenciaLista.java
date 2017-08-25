package br.ufmt.ic.alg3.videoJogos.persistencia.lista;
import br.ufmt.ic.alg3.videoJogos.model.entidades.Promocao;
import br.ufmt.ic.alg3.videoJogos.persistencia.PromocaoPersistencia;
import java.util.ArrayList;
import java.util.List;

public class PromocaoPersistenciaLista 
        implements PromocaoPersistencia {
    
        protected List lista = new ArrayList();
        
    @Override
    public void inserir(Promocao novoPromocao) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Promocao ultimo = (Promocao) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoPromocao.setId(ultimoId + 1);
        lista.add(novoPromocao);
    }
    @Override
    public void alterar(Promocao novoPromocao) {
        for (int i = 0; i < lista.size(); i++) {
            Promocao elem = (Promocao) lista.get(i);
            if(novoPromocao.getId() == elem.getId()){
                lista.set(i, novoPromocao);
            }
        }
    }
    @Override
    public void remover(Promocao novoPromocao) {
          int posicao = 0;
        while (posicao < lista.size()) {
            Promocao elemento = (Promocao) lista.get(posicao);
            if (elemento.getId() == novoPromocao.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

   //vou deixar aqui 
    public Promocao buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Promocao elem = (Promocao) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<Promocao> getAll(){
      return lista;
  }
 
}