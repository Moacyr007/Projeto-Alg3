/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia.sql;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Usuario;
import br.ufmt.ic.alg3.videoJogos.persistencia.UsuarioPersistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moacyr
 */
public class UsuarioPersistenciaMySQL implements UsuarioPersistencia{

    @Override
    public void inserir(Usuario usuario) {
<<<<<<< HEAD
        /*try {
=======
        try {
>>>>>>> master
            Connection connecton = DriverManager.getConnection("jdbc:mysql://localhost:3306/funeraria", "root","123");
            
            
            
            
            //                                              + "'"
            
<<<<<<< HEAD
            /*String sql = "insert into responsavel";
=======
            String sql = "insert into responsavel";
>>>>>>> master
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioPersistenciaMySQL.class.getName()).log(Level.SEVERE, null, ex);
<<<<<<< HEAD
        }*/
=======
        }
>>>>>>> master
    }

    @Override
    public void alterar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario buscar(int id, String cpf, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
<<<<<<< HEAD
}
=======
}
>>>>>>> master
