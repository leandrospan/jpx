import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

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
        jbtnConecta.setText("Concecta");
        // tratamento de evento
        jbtnConecta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Clientes cliente = new Clientes();
                cliente.setCodigo(Integer.parseInt(jtfCodigo.getText()));
                cliente.setNome(jtfNome.getText());
                ClientesDAO cliDAO = new ClientesDAO();
                cliDAO.adiciona(cliente);
                JOptionPane.showMessageDialog(null, "Cliente Salvo!");
            }
        });
        //Botão que clama a tela de teste de tabela
        JButton jbtnTabela = new JButton();
        jbtnTabela.setText("Tabela");
        // tratamento de evento
        jbtnTabela.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                TelaTeste002 tt2 = new TelaTeste002();
                tt2.setVisible(true);
            }
        });
        //Botão que clama a tela de teste de tabela com AbstractTableModel
        JButton jbtnTabelaAT = new JButton();
        jbtnTabelaAT.setText("TabelaAT");
        // tratamento de evento
        jbtnTabelaAT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                TelaTeste003 tt3 = new TelaTeste003();
                tt3.setVisible(true);
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
        gbc.gridwidth = 3;
        painel.add(jtfNome, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;        
        painel.add(jbtnInserir, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;        
        painel.add(jbtnConecta, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;        
        painel.add(jbtnTabela, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;        
        painel.add(jbtnTabelaAT, gbc);


       
        this.add(painel);
        this.setVisible(true);
    }

}
