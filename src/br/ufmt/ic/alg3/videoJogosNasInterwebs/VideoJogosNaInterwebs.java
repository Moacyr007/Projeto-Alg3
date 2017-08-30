/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogosNasInterwebs;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Usuario;
import br.ufmt.ic.alg3.videoJogos.persistencia.sql.UsuarioPersistenciaMySQL;
import br.ufmt.ic.alg3.videoJogos.view.PrincipalJFrame;

/**
 *
 * @author Moacyr
 */
public class VideoJogosNaInterwebs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //   PrincipalJFrame tela = new PrincipalJFrame();
      //  tela.setVisible(true);
    
        UsuarioPersistenciaMySQL my = new UsuarioPersistenciaMySQL();
        Usuario usuario = new Usuario();
        usuario.setNome("Moacyr");
        usuario.setEmail("moacyr.moacyr11@gmail.com");
        usuario.setDataNasc("06/05/1998");
        usuario.setSenha("123456");
        
        my.inserir(usuario);
        
    
    }
    
}
