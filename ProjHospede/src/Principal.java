import javax.swing.JOptionPane;

public class Principal {
    
    public static void escreve(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static String recebe(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
    
    public static boolean confirmar(String mensagem){
        int resposta = JOptionPane.showConfirmDialog(null, mensagem,"Sair",JOptionPane.YES_NO_OPTION);
        if(resposta == 0){
            escreve("Obrigado!");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Hospede hosp = new Hospede();
        Hospedagem hope = new Hospedagem();
        
        boolean continuar = true;
        
        while(continuar) {
            String opcao = recebe("Digite a opção desejava!\n"
                        + "1 - Cadastrar Hospede\n"
                        + "2 - Exibir Hospede\n"
                        + "3 - Calcular Check-Out\n"
                        + "4 - Verificar Desconto\n"
                        + "0 - Sair");
            switch(opcao){
                case "1":
                    hosp.nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
                    hosp.setCpf(JOptionPane.showInputDialog(null, "Digite o cpf: "));
                    hosp.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o telefone: ")));
                    hosp.idade = Integer.parseInt(recebe("Digite a idade: "));
                    break;
                case "2":
                    escreve("Nome: "+ hosp.nome+ "\n"
                          + "Cpf: "+ hosp.getCpf()+ "\n"
                          + "Telefone: "+ hosp.getTelefone()+ "\n"
                          + "Idade: "+ hosp.idade+ "\n");
                    break; 
                case "3":
                    hope.numdias = (Integer.parseInt(recebe("Digite o numero de dias: ")));
                    hope.valordiario = (Double.parseDouble(recebe("Digite o valor diario: ")));
                    hope.setConsumo(Double.parseDouble(recebe("Digite o valor do consumo: ")));
                    hope.setAdicional(Double.parseDouble(recebe("Digite o valor adicional: ")));
                    double totalCheckout = hope.CalcularCheckout();
                    escreve("Total do check-out: " + totalCheckout);
                    break;
                case "4":
                    double vl = Double.parseDouble(recebe("Digite o valor do check-out: "));
                    hosp.CalcularDesconto(vl);
                    break;
                case "0":
                    continuar = confirmar("Deseja realmente sair?");
                    break;
                default:
                    escreve("Digite uma opção válida!!");
            }
        }
        
    }
    
}
