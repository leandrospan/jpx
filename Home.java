import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.ParseException;


/**
 * Escreva a descrição da classe Home aqui.
 * 
 * @author Leandro Spanghero 
 * @version 0.0.1
 */
public class Home extends JFrame
{
    CadCliente cc;
    /**
     * COnstrutor para objetos da classe Home
     */
    public Home()
    {
        this.setTitle("-- QUIMERA | ERP -- TELA PRINCIPAL");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        


        JMenuBar jmb = new JMenuBar();
        JMenu cadastro = new JMenu("Cadastros");
        JMenuItem cadCli = new JMenuItem("Clientes");
        cadCli.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                //cc.setVisible(true); 
                try{
                    cc = new CadCliente();
                }catch(ParseException pe){
                    JOptionPane.showMessageDialog(null, "Erro: " + pe);
                }
            }
        });
        cadastro.add(cadCli);
        jmb.add(cadastro);
        this.setJMenuBar(jmb);
        
        
        
        this.setVisible(true);
    }
}
