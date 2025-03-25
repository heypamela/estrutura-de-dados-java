import java.util.Scanner;
import java.util.Stack;

public class Exercicio2_Pilha {
   public static void main(String[] args) {
        Stack<String> listaLivros = new Stack<String>();
        Scanner lerScanner = new Scanner(System.in);

        int opcao;
        String livro, livroRetirado, pilhaVazia = "A Pilha está vazia!";

        do {
            System.out.println("\n📚-📚-📚-📚-📚-📚-📚-📚-📚-📚-📚📚-📚-📚");
            System.out.println("\n 1 - Adicionar um livro na pilha");
            System.out.println(" 2 - Lista todos os livros");
            System.out.println(" 3 - Retirar livro da pilha");
            System.out.println(" 0 - Sair \n");
            System.out.println("📚-📚-📚-📚-📚-📚-📚-📚-📚-📚-📚📚-📚-📚");


            System.out.println("\n Digite a opção desejada: ");

            opcao = lerScanner.nextInt();
            lerScanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    livro = lerScanner.nextLine();
                    listaLivros.push(livro);
                    
                    System.out.println("\nLivro Adicionado!");

                    System.out.println("\nPilha: ");
                    for (String cliente : listaLivros) {
                            System.out.println(cliente);
                    }
                    break;
            
                case 2:
                    if(listaLivros.isEmpty()){
                        System.out.println(pilhaVazia);
                    } else{
                        System.out.println("\nPilha: ");
                        for (String livros : listaLivros) {
                            System.out.println(livros);
                        }
                    }
                    break;

                case 3:
                    if (listaLivros.isEmpty()) {
                        System.out.println(pilhaVazia);
                    } else {
                        livroRetirado = listaLivros.pop();
                        System.out.println("Um Livro foi retirado da pilha! \nLivro: " + livroRetirado);
                    
                        System.out.println("\nPilha: ");
                        for (String cliente : listaLivros) {
                            System.out.println(cliente);
                        }
                    }
                    break;
        
                case 0:
                    System.out.println("Programa Finalizado!");
                    System.out.println("Até mais 👋");
                    break;

                default:
                    System.out.println("Opção Inválida ❌");
                    break;
            }
        } while (opcao != 0);
        
        lerScanner.close();

    }
}
