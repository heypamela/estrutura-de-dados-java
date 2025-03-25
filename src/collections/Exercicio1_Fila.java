import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1_Fila {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);
        Queue<String> filaClientes = new LinkedList<String>();

        int opcao;
        String nome, proximoCliente, filaVazia = "A Fila está vazia!";
        
        do {
            System.out.println("###############################################");
            System.out.println("\n  Digite 1 para adicionar de um novo cliente ");
            System.out.println("  Digite 2 para ver a lista de clientes        ");
            System.out.println("  Digite 3 para chamar um cliente              ");
            System.out.println("  Digite 0 para finalizar                    \n");
            System.out.println("###############################################");

            System.out.println("\n    Digite a opção desejada:              \n");

            opcao = lerScanner.nextInt();
            lerScanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    nome = lerScanner.nextLine();
                    filaClientes.add(nome);
                    
                    System.out.println("Cliente Adicionado!");

                    System.out.println("\nFila: ");
                    for (String cliente : filaClientes) {
                            System.out.println(cliente);
                    }
                    break;
            
                case 2:
                    if(filaClientes.isEmpty()){
                        System.out.println(filaVazia);
                    } else{
                        System.out.println("Fila: ");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println(filaVazia);
                    } else {
                        proximoCliente = filaClientes.poll();
                        System.out.println("O Cliente " + proximoCliente + " foi Chamado!");
                    
                        System.out.println("\nFila: ");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                break;
        
                case 0:
                    System.out.println("Programa Finalizado!");
                    System.out.println("Até mais 👋");
                break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
        
        lerScanner.close();
    }
}


