import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
    public CadCliente()
    {
        this.setTitle("-- QUIMERA | ERP -- CADASTRO DE CLIENTES ");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JPanel jpnlHeader = new JPanel();
        jpnlHeader.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 2, 2);
        jpnlHeader.setPreferredSize(new Dimension(600, 298));
        JLabel jlblCodigoCli = new JLabel();
        jlblCodigoCli.setText("Código: ");
        
        
        jpnlHeader.add(jlblCodigoCli);
        
        this.add(jpnlHeader);
        this.setVisible(true);
    }
}
