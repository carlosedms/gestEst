import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    Scanner scan = new Scanner(System.in);
    ArrayList<Produto> lista = new ArrayList<Produto>(); // É iniciada uma ArrayList de objetos da classe "Produto" que funcionará como estoque, guardando todos os objetos das subclasses de Produto.

    public void adicionarProduto(){
        System.out.println("\n(1) Smartphone");
        System.out.println("(2) Laptop");
        System.out.print("Selecione o item a ser adicionado ao estoque: ");
        String opcao = scan.nextLine();

        switch (opcao) {
            case "1" -> { // O usuário insere um smartphone no estoque
                try{
                    System.out.println("\nInsira as informações do Smartphone a ser inserido:");
                    System.out.print("Marca: ");
                    String marca = scan.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Valor: ");
                    double preco = Double.parseDouble(scan.nextLine());

                    lista.add(new Smartphone(modelo, marca, preco));
                    System.out.println("\nSmartphone inserido no estoque com sucesso.\n");
                }catch(NumberFormatException e){
                    System.out.println("Input inválido. Retornando ao menu...\n");
                }
            }
            case "2" -> { // O usuário insere um laptop no estoque
                try{
                    System.out.println("\nInsira as informações do Laptop a ser inserido:");
                    System.out.print("Modelo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Tamanho da tela (em polegadas): ");
                    double tela = Double.parseDouble(scan.nextLine());
                    System.out.print("Valor: ");
                    double preco = Double.parseDouble(scan.nextLine());

                    lista.add(new Laptop(modelo, tela, preco));
                    System.out.println("\nLaptop inserido no estoque com sucesso.\n");
                }catch(NumberFormatException e){
                    System.out.println("Input inválido. Retornando ao menu...\n");
                }
            }
            default -> System.out.println("\nItem inválido. Retornando ao menu...\n");
        }
    }

    public void removerProduto(){
        if(lista.size()==0){
            System.out.println("\nO estoque está vazio.\n");
        }else{
            System.out.println("\nLista de produtos atualmente no estoque:\n");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print("Item " + (i + 1) + ":\n");
                System.out.println(lista.get(i));
            }
            System.out.print("Escolha o item a ser removido (0 para cancelar): ");

            int input = Integer.parseInt(scan.nextLine());

            if(input==0){
                System.out.println("Operação cancelada. Retornando ao menu...\n");
            }else if(input > lista.size()){
                System.out.println("Item inválido. Retornando ao menu...\n");
            }else{
                input--;
                lista.remove(input);
                System.out.println("\nItem removido com sucesso.\n");
            }
        }
    }

    public void listarProdutos(){
        if(lista.isEmpty()){
            System.out.println("\nO estoque está vazio.\n");
        }else {
            System.out.println("\nLista de itens atualmente no estoque:\n");
            for (int i = 0; i < lista.size(); i++) {
                System.out.print("Item " + (i + 1) + ":\n");
                System.out.println(lista.get(i));
            }
        }
    }

}
