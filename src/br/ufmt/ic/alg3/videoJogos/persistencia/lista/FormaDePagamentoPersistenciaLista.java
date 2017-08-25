
package br.ufmt.ic.alg3.videoJogos.persistencia.lista;
import br.ufmt.ic.alg3.videoJogos.model.entidades.FormaDePagamento;
import br.ufmt.ic.alg3.videoJogos.persistencia.FormaDePagamentoPersistencia;
import java.util.ArrayList;
import java.util.List;

public class FormaDePagamentoPersistenciaLista 
        implements FormaDePagamentoPersistencia {
    
    protected List lista = new ArrayList();
    
    @Override
    public void inserir(FormaDePagamento novoFormaDePagamento) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            FormaDePagamento ultimo = (FormaDePagamento) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoFormaDePagamento.setId(ultimoId + 1);
        lista.add(novoFormaDePagamento);
    }
    @Override
    public void alterar(FormaDePagamento novoFormaDePagamento) {
        for (int i = 0; i < lista.size(); i++) {
            FormaDePagamento elem = (FormaDePagamento) lista.get(i);
            if(novoFormaDePagamento.getId() == elem.getId()){
                lista.set(i, novoFormaDePagamento);
            }
        }
    }
    @Override
    public void remover(FormaDePagamento novoFormaDePagamento) {
          int posicao = 0;
        while (posicao < lista.size()) {
            FormaDePagamento elemento = (FormaDePagamento) lista.get(posicao);
            if (elemento.getId() == novoFormaDePagamento.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    public FormaDePagamento buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            FormaDePagamento elem = (FormaDePagamento) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<FormaDePagamento> getAll(){
      return lista;
  }
 
}