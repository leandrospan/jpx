import javax.swing.JFrame;

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
        this.setTitle("--QUIMERA | ERP--");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        JMenu menu, submenu;
        JMenuItem i1, i2, i3, i4, i5;
        JMenuBar jmb = new JMenuBar();
        
        this.setVisible(true);
    }
}
