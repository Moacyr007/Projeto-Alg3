
package br.ufmt.ic.alg3.videoJogos.persistencia.lista;
import br.ufmt.ic.alg3.videoJogos.model.entidades.CartaoDeCredito;
import br.ufmt.ic.alg3.videoJogos.persistencia.CartaoDeCreditoPersistencia;
import java.util.ArrayList;
import java.util.List;

public class CartaoDeCreditoPersistenciaLista 
        implements CartaoDeCreditoPersistencia {
    
    protected List lista = new ArrayList();
    @Override
    public void inserir(CartaoDeCredito novoCartaoDeCredito) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            CartaoDeCredito ultimo = (CartaoDeCredito) lista.get(posicaoUltimo);
            ultimoId = ultimo.getNumCartao();
        }   
        novoCartaoDeCredito.setNumCartao(ultimoId + 1);
        lista.add(novoCartaoDeCredito);
    }
    @Override
    public void alterar(CartaoDeCredito novoCartaoDeCredito) {
        for (int i = 0; i < lista.size(); i++) {
            CartaoDeCredito elem = (CartaoDeCredito) lista.get(i);
            if(novoCartaoDeCredito.getNumCartao() == elem.getNumCartao()){
                lista.set(i, novoCartaoDeCredito);
            }
        }
    }
    @Override
    public void remover(CartaoDeCredito novoCartaoDeCredito) {
          int posicao = 0;
        while (posicao < lista.size()) {
            CartaoDeCredito elemento = (CartaoDeCredito) lista.get(posicao);
            if (elemento.getNumCartao() == novoCartaoDeCredito.getNumCartao()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    public CartaoDeCredito buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            CartaoDeCredito elem = (CartaoDeCredito) lista.get(i);
            if(elem.getNumCartao() == id){
                return elem;
            }
         }
        return null;
    }
    @Override
  public List<CartaoDeCredito> getAll(){
      return lista;
  }
 
}