
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;


 
public class Menu {
     private ArrayList<OrdemServico> listaOrdens;
     private ArrayList<Box> listaBox;
    
    

    public Menu(ArrayList<OrdemServico> listaOrdens, ArrayList<Box> listaBox) {
        this.listaOrdens = listaOrdens;
        this.listaBox = listaBox;
    }
    
     public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        do {
            System.out.println("Digite 0 para sair");
            System.out.println("Digite 1 para cadastrar uma ordem de serviço");
            System.out.println("Digite 2 para associar um mecanico a uma box");
            System.out.println("Digite 3 para exibir ordens de uma box");
            System.out.println("Digite 4 para atribuir ordem de serviço a uma box");
            System.out.println("Digite 5 para obter ordens finalizadas por uma box");
            System.out.println("Digite 6 para buscar ordens por status");
            System.out.println("Digite 7 para exibir detalhes de uma ordem");
            System.out.println("Digite a opção desejada: ");
            input = scanner.nextInt();
            if (input == 0){
                System.out.println("Obrigado, volte sempre!");
                break;
            }
            if (input == 1) {
                
            }

            if (input == 2){
                int numero = 0;
                System.out.println("Digite o número da box: ");
                numero = scanner.nextInt();
                for(Box box : listaBox){
                    if(numero = box.getNumero){
                        box.associarMecanico(mecanico);}}
            }
            if (input == 3){
                
            }
            if (input == 4){
                int numero;
                for (Box box : listaBox){
                    if(numero == box.getNumero()){
                        box.exibirOrdens;
                    }
                }
            }
            if (input == 5){
                String status = "finalizada";
                int contador = 0;
                for(Box box: listaBox){
                    box.
                    contador+=1;
                    }
                }
                System.out.println("");
            }
            
            if (input == 6){
                String status;
                System.out.println("Digite o status da ordem: ");
                status = scanner.next();
                for(OrdemServico ordem: listaOrdens){
                    if(status.equalsIgnoreCase(ordem.getStatus())){
                    ordem.exibirDetalhesCompleto();
                    }
                }
            }
            
            if (input == 7){
                String codigo;
                System.out.println("Digite o codigo da ordem: ");
                codigo = scanner.next();
                for(OrdemServico ordem: listaOrdens){
                    if(codigo.equalsIgnoreCase(ordem.getCodigo())){
                    ordem.exibirDetalhesCompleto();
                    }
                }
            }
        } while (input != 0);
    }
}
