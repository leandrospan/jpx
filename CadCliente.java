import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.text.ParseException;
import java.awt.Font;

/**
 * Escreva a descrição da classe CadCliente aqui.
 * 
 * @author Leandro Spanghero 
 * @version 0.0.1
 */
public class CadCliente extends JFrame
{
    /**
     * COnstrutor para objetos da classe CadCliente
     */
    public CadCliente() throws ParseException
    {
        this.setTitle("-- QUIMERA | ERP -- CADASTRO DE CLIENTES ");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JPanel jpnlHeader = new JPanel();
        jpnlHeader.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 2, 2);
        jpnlHeader.setPreferredSize(new Dimension(600, 298));
        
        JLabel jlblTitulo = new JLabel("CADASTRO DE CLIENTES");
        jlblTitulo.setFont(new Font("Serif", Font.BOLD, 22));
        JLabel jlblCodigoCli = new JLabel("Código: ");
        JTextField jtfCodigoCli = new JTextField(5);
        JLabel jlblNomeCli = new JLabel("Nome: ");
        JTextField jtfNomeCli = new JTextField(15);
        JLabel jlblSobrenomeCli = new JLabel("Sobrenome: ");
        JTextField jtfSobrenomeCli = new JTextField(15);
        JLabel jlblDataNascCli = new JLabel("Data de Nascimeto: ");
        MaskFormatter mfDataNascCli = new MaskFormatter("##/##/####");
        JFormattedTextField jftfDataNascCli = new JFormattedTextField(mfDataNascCli);
        jftfDataNascCli.setColumns(7);
        
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        jpnlHeader.add(jlblTitulo, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        jpnlHeader.add(jlblCodigoCli, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;        
        gbc.anchor = GridBagConstraints.EAST;        
        jpnlHeader.add(jtfCodigoCli, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;        
        gbc.anchor = GridBagConstraints.WEST;        
        jpnlHeader.add(jlblNomeCli, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;        
        gbc.anchor = GridBagConstraints.EAST;        
        jpnlHeader.add(jtfNomeCli, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;        
        gbc.anchor = GridBagConstraints.WEST;        
        jpnlHeader.add(jlblSobrenomeCli, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;        
        gbc.anchor = GridBagConstraints.EAST;        
        jpnlHeader.add(jtfSobrenomeCli, gbc);        
        gbc.gridx = 0;
        gbc.gridy = 4;        
        gbc.anchor = GridBagConstraints.WEST;        
        jpnlHeader.add(jlblDataNascCli, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;        
        gbc.anchor = GridBagConstraints.EAST;        
        jpnlHeader.add(jftfDataNascCli, gbc);
        
        this.add(jpnlHeader);
        this.setVisible(true);
    }
}
