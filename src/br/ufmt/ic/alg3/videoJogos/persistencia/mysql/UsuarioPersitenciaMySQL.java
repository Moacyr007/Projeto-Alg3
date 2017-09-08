/*
 * To change this license header, choose Licetnse Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.persistencia.mysql;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Usuario;
import br.ufmt.ic.alg3.videoJogos.persistencia.UsuarioPersistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author moacyr
 */
public class UsuarioPersitenciaMySQL implements UsuarioPersistencia {

    public void inserir(Usuario usuario) {
        try {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/funeraria", "root", "123");
            
            String sql = "insert into usuario "
                    + "(nome,rg,telefone,endereco,email,cpf) "
                    + "values "
                    + "('"+usuario.getNome()+"',"
                    + " '"+usuario.getEmail()+"',"
                    + " '"+usuario.getSenha()+"',"
                    + "'"+usuario.getDataNasc()+"');";
            
            
            System.out.println(sql);
            Statement st = con.createStatement();
            st.execute(sql);
            
            con.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    public void alterar(Usuario usuario) {

    }

    public void remover(Usuario usuario) {

    }

    public Usuario buscar(int id, String cpf, String nome) {
        return null;
    }

    public List<Usuario> getAll() {
        return null;
    }
}
