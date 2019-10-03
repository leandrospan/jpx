import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Escreva a descrição da classe Home aqui.
 * 
 * @author Leandro Spanghero 
 * @version 0.0.1
 */
public class Home extends JFrame
{
    /**
     * COnstrutor para objetos da classe Home
     */
    public Home()
    {
        this.setTitle("--QUIMERA | ERP-- TELA PRINCIPAL");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        JMenuBar jmb = new JMenuBar();
        JMenu cadastro = new JMenu("Cadastros");
        JMenuItem cadCli = new JMenuItem("Clientes");
        cadCli.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                CadCliente cc = new CadCliente();
                cc.setVisible(true);
            }
        });
        cadastro.add(cadCli);
        jmb.add(cadastro);
        this.setJMenuBar(jmb);
        
        
        
        this.setVisible(true);
    }
}
