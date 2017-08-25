/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia;

import br.ufmt.ic.alg3.videoJogos.model.entidades.BoletoBancario;
import java.util.List;

/**
 *
 * @author Moacyr
 */
public interface BoletoBancarioPersistencia {
    
    public void inserir(BoletoBancario boletoBancario);
    
    public void alterar(BoletoBancario boletoBancario);
    
    public void remover(BoletoBancario boletoBancario);
    
    public List<BoletoBancario> getAll();
}

