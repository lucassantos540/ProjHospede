import javax.swing.JOptionPane;

public class Hospede {
    
    public static void escreve(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static String recebe(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
    
  
    public String nome;
    private String cpf;
    private int telefone;
    public int idade;
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public int getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    
    public void CalcularDesconto(double vl){
        if(this.idade >= 60){
            escreve(
            "O hospede tem desconto de 10%\n"
            + "Valor sem desconto: "+vl + "\n"
            + "Valor com 10% de desconto: "+vl*0.9);
        }else {
            escreve(
            "O hospede não tem direito a desconto no imposto\n"
            + "Valor sem desconto: "+vl);
        }
    }

}
