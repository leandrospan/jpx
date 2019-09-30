import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * Escreva a descrição da classe CientesDAO aqui.
 * 
 * @author Leandro Spanghero 
 * @version v1.0
 */
public class ClientesDAO
{
    private Connection conexao;
    public ClientesDAO()
    {
        this.conexao = new ConexaoBD().conectar();
    }

    public void adiciona(Clientes cliente)
    {
       String sql = "INSERT INTO clientes(codigo, nome) values (?, ?)";
       try{
           //Preparando o preparedStatement para inserir os dados
           PreparedStatement ps = conexao.prepareStatement(sql);
           ps.setInt(1, cliente.getCodigo());
           ps.setString(2, cliente.getNome());
           ps.execute();
           ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}