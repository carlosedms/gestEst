import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Scanner iniciado para receber inputs do usuário

        Estoque noEstoque = new Estoque(); // Objeto estoque é criado para armazenar e interagir com os itens
        // TODO: 27/06/2023 transformar essa string de escolha aqui embaixo de String pra int
        String opcao = ""; // Variável usada para escolha de opção no menu (em formato de string pra simplificar o tratamento, eu fiz antes de descobrir como usava os tratamentos de exceções)

        while(!opcao.equals("4")){ // Loop do menu
            System.out.println("(1) Adicionar produto ao estoque");
            System.out.println("(2) Listar produtos no estoque");
            System.out.println("(3) Remover produto do estoque");
            System.out.println("(4) Finalizar programa");
            System.out.print("Insira uma opção: ");
            opcao = scan.nextLine(); // Usuário escolhe a opção desejada.1

            switch (opcao) {
                case "1" -> noEstoque.adicionarProduto();
                case "2" -> noEstoque.listarProdutos();
                case "3" -> noEstoque.removerProduto();
                case "4" -> {
                    System.out.println("\nFinalizando programa.");
                }
                default -> System.out.println("\nOpção inválida.\n");
            }
        }
    }
}