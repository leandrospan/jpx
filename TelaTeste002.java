import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Insets;


/**
 * Escreva a descrição da classe TelaTeste002 aqui.
 * 
 * @author Leandro Spanghero 
 * @version v1.0
 */
public class TelaTeste002 extends JFrame
{
    /**
     * COnstrutor para objetos da classe TelaTeste002
     */
    public TelaTeste002()
    {
        //Tamanho
        this.setSize(400, 400);
        //Centraliza a Tela
        this.setLocationRelativeTo(null);
        //Título da tela
        this.setTitle("...::: TESTE TABELA :::...");
        //Quando clicar o "X" fecha a janela
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        //---------------Desenho da TABELA ------------------
        String[] colunas = new String[]{"--NOME--", "--IDADE--", "--SEXO--"};
        String[][] dados = new String[][]{
            {"Maria Eduarda", "28", "Feminino"},
            {"Gabriela", "22", "Feminino"}
        };
        JTable tabela = new JTable(dados, colunas);
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(tabela);
        
        JLabel jlblNome = new JLabel("Nome: ");
        JTextField jtfNome = new JTextField(10);
        JLabel jlblIdade = new JLabel("Idade: ");
        JTextField jtfIdade = new JTextField(10);
        JLabel jlblSexo = new JLabel("Sexo: ");
        JTextField jtfSexo = new JTextField(10);
        JButton jbtnInsere = new JButton("Inserir");  
        JPanel painel01 = new JPanel();
        JPanel painel02 = new JPanel();

        // Tamanho dos painéis e ajuste em tela
        painel01.setPreferredSize(new Dimension(400,198));
        painel01.setLayout(new GridLayout(1, 1));
        painel01.add(scroll);
        
        painel02.setPreferredSize(new Dimension(400,198));                
        //gerenciamento de layout
        painel02.setLayout(new GridBagLayout());
        //configuração de layout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        painel02.add(jlblNome, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;        
        painel02.add(jtfNome, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        painel02.add(jlblIdade, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        painel02.add(jtfIdade, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;        
        painel02.add(jlblSexo, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;        
        painel02.add(jtfSexo, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        painel02.add(jbtnInsere, gbc);
        this.add(painel01);
        this.add(painel02);
        
        this.setVisible(true);
    }
}
