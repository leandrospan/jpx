
/**
 * Escreva a descrição da classe Clientes aqui.
 * 
 * @author Leandro Spanghero 
 * @version v1.0
 */
public class Clientes
{
    private int codigo;
    private String nome;
    public Clientes()
    {
    }

    public int getCodigo()
    {
        return this.codigo;
    }
    
    public void setCodigo(int c){
        this.codigo = c;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
}
