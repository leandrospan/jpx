
import javax.swing.table.AbstractTableModel;

import java.util.List;
import java.util.ArrayList;

/**
 * Escreva a descrição da classe ModeloTabela aqui.
 * 
 * @author Leandro Spanghero 
 * @version v1.0
 */
public class ModeloTabela extends AbstractTableModel
{
    private List<Clientes> dados;
    private String[] colunas = {"||CÓDIGO||", "||NOME||"};
    
    /**
     * COnstrutor para objetos da classe ModeloTabela
     */
    public ModeloTabela()
    {
        dados = new ArrayList<Clientes>();
    }
    
    public void addRow(Clientes c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public String getColumnName(int num){
        return this.colunas[num];
    }

    @Override
    public int getRowCount(){
        return dados.size();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        switch(coluna){
            case 0: return dados.get(linha).getCodigo();
            case 1: return dados.get(linha).getNome();
        }
        return null;
    }
    
    @Override
    public void setValueAt(Object aValue, int linha, int coluna){
        Clientes c = this.dados.get(linha);
        switch(coluna){
            case 0:
                c.setCodigo((int) aValue);
                break;
            case 1:
                c.setNome(String.valueOf(aValue));
        }
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public Clientes get(int linha){
        return this.dados.get(linha);
    }
    
    public boolean isCellEditable(int linha, int coluna){
        return true;
    }
}
