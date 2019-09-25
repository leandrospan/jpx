import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Escreva a descrição da classe ConexaoBD aqui.
 * 
 * @author Leandro Spanghero 
 * @version v1.0
 */
public class ConexaoBD
{
    Connection conexao;
    public Connection conectar(){ 

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost/jpxbd?user=pi&password=flapi123");
            JOptionPane.showMessageDialog(null, "Conectou!!!");
            return conexao;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return conexao;
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return conexao;
        } 
    }
}
