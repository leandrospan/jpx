import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Escreva a descrição da classe TelaTeste001 aqui.
 * 
 * @author Leandro Spanghero
 * @version 1.0
 */
public class TelaTeste001 extends JFrame
{

    /**
     * COnstrutor para objetos da classe TelaTeste001
     */
    public TelaTeste001()
    {
        //Tamanho
        this.setSize(400, 400);
        //Centraliza a Tela
        this.setLocationRelativeTo(null);
        //Título da tela
        this.setTitle("...::: TESTE BD :::...");
        //Quando clicar o "X" fecha a janela
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        //---------------Desenho da Tela----------------
        JPanel painel = new JPanel();
        //Label codigo
        JLabel jlblCodigo = new JLabel();
        //Texto label
        jlblCodigo.setText("Código:");
        //Entrada do Código
        JTextField jtfCodigo = new JTextField(5);
        //Label codigo
        JLabel jlblNome = new JLabel();
        //Texto label
        jlblNome.setText("Nome:");
        //Entrada do Código
        JTextField jtfNome = new JTextField(25);
        //Botão inserir
        JButton jbtnInserir = new JButton();
        jbtnInserir.setText("Inserir");
        // tratamento de evento
        jbtnInserir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String mensagem = "Código: " + jtfCodigo.getText() + "\n Nome: " + jtfNome.getText();
                JOptionPane.showMessageDialog(null, mensagem);
            }    
        });
        //Botão testa conexão JDBC
        JButton jbtnConecta = new JButton();
        jbtnConecta.setText("Conceta");
        // tratamento de evento
        jbtnConecta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Connection conexao = DriverManager.getConnection("jdbc:mariadb://localhost/jpxbd?user=pi&password=flapi123");
                    JOptionPane.showMessageDialog(null, "Conectou!!!");
                    conexao.close();
                } catch(SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });
        
        

        //gerenciando layout
        painel.setLayout(new GridBagLayout());
        //configuração do layout
        GridBagConstraints gbc = new GridBagConstraints();
        // setando 0 para x
        //gbc.gridx = 0;
        // setando espaço em volta do compoente (cima, esquerda, baixo direita)
        gbc.insets = new Insets(2, 2, 2, 2);
        //gbc.fill = GridBagConstraints.BOTH;
        //Configuração de Layout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        painel.add(jlblCodigo, gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        painel.add(jtfCodigo, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;        
        painel.add(jlblNome, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        painel.add(jtfNome, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        painel.add(jbtnInserir, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        painel.add(jbtnConecta, gbc);

       
        this.add(painel);
        this.setVisible(true);
    }

}
