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
            System.out.println("----------------------------------------");
            System.out.println("\n 1 - Adicionar um cliente na fila");
            System.out.println(" 2 - Lista todos os clientes");
            System.out.println(" 3 - Chamar um cliente da fila");
            System.out.println(" 0 - Sair \n");
            System.out.println("----------------------------------------");

            System.out.println("\n   Entre a com opção desejada: ");

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


