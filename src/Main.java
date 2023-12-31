import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Scanner iniciado para receber inputs do usuário

        Estoque noEstoque = new Estoque(); // Objeto estoque é criado para armazenar e interagir com os itens
        int opcao=-1; // Variável usada para escolha de opção no menu (em formato de string pra simplificar o tratamento, eu fiz antes de descobrir como usava os tratamentos de exceções)

        do{ // Loop do menu
            System.out.println("\n(1) Adicionar produto ao estoque");
            System.out.println("(2) Listar produtos no estoque");
            System.out.println("(3) Remover produto do estoque");
            System.out.println("(4) Resumo dos produtos em estoque");
            System.out.println("(5) Iniciar Interface Gráfica");
            System.out.println("(0) Finalizar programa");
            System.out.print("Insira uma opção: ");

            try{
                opcao = scan.nextInt(); // Usuário escolhe a opção desejada.

                switch (opcao) {
                    case 1 -> noEstoque.adicionarProduto();
                    case 2 -> noEstoque.listarProdutos();
                    case 3 -> noEstoque.removerProduto();
                    case 4 -> noEstoque.resumirEstoque();
                    case 5 -> {
                        Frame janela = new Frame();
                        opcao = 0;
                    }
                    case 0 -> {
                        System.out.println("\nFinalizando programa.");
                    }
                    default -> System.out.println("\nOpção inválida.\n");
                }
            }catch(InputMismatchException e){ // Se o input do usuário não for um inteiro
                System.out.println("\nEntrada inválida.\n");
                scan.next();
            }
        }while(opcao!=0);
    }
}