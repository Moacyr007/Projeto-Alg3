/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.videoJogos.view.tableModel;

import br.ufmt.ic.alg3.videoJogos.model.entidades.Jogo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Moacyr
 */
public class JogoTableModel extends AbstractTableModel {
    
    private List<Jogo> lista;
    private static String[] nomes =
                new String[]{"Id", "Nome", "Preço", "Tipo"};
            
    public JogoTableModel(List<Jogo> lista){
        this.lista = lista;
    }


    @Override
    public String getColumnName(int column) {
        return nomes[column];
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Jogo jogo = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return jogo.getId();
            case 1:
                return jogo.getNome();
            case 2:
                return jogo.getPreco();
            case 3:
                return jogo.getTipo();
        }
        return null;
    }
   
}
