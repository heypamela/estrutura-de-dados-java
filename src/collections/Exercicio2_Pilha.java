import java.util.Scanner;

public class Exercicio2_Pilha {
   public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        int opcao;
        String nome;

        System.out.println("##############################################");
        System.out.println("\n     Digite 1 para adicionar de um livro    ");
        System.out.println("     Digite 2 para ver a lista de livros     ");
        System.out.println("     Digite 3 para remover um livro          ");
        System.out.println("     Digite 0 para finalizar               \n");
        System.out.println("##############################################");

        System.out.println("\n    Digite a opção desejada:              \n");

        opcao = lerScanner.nextInt();

        switch (opcao) {
            case 1:
                
                break;
            
            case 2:
                
            break;

            case 3:
                
            break;
        
            case 0:
                System.out.println("Programa Finalizado!");
            break;

            default:
                System.out.println("A Pilha está vazia!");
                break;
        }
    }
}
