import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Estoque {
    Scanner scan = new Scanner(System.in);
    ArrayList<Produto> lista = new ArrayList<>(); // É iniciada uma ArrayList de objetos da classe "Produto" que funcionará como estoque, guardando todos os objetos das subclasses de Produto.
    int opcao = 0;
    
    Map<String, Integer> qtdEstoque = new HashMap<>();
    
    private void imprimirEstoque(){ // método utilizado somente nesta classe
        System.out.println("\nLista de itens atualmente no estoque:\n");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("----------- Item " + (i + 1) + " -----------\n");
            System.out.println(lista.get(i));
        }
    }
    
    private void atualizaEstoque(Produto produto) {
        String tipoProduto = produto.getClass().getSimpleName();
        qtdEstoque.put(tipoProduto, qtdEstoque.getOrDefault(tipoProduto, 0) + 1);
    }

    public void adicionarProduto() {

        System.out.println("\n(1) Smartphone");
        System.out.println("(2) Laptop");
        System.out.println("(3) Monitor");
        System.out.println("(4) Teclado Bluetooth");
        System.out.println("(5) Fone Bluetooth");
        System.out.println("(0) Retornar ao menu");
        System.out.print("Insira uma opção: ");

        try {
            opcao = Integer.parseInt(scan.nextLine()); // Usuário escolhe a opção desejada.

            switch (opcao) {
                case 0 -> System.out.println("\nRetornando ao menu.\n");
                case 1 -> {
                    try {
                        System.out.println("\nInsira as informações do Smartphone a ser inserido:");
                        System.out.print("Marca: ");
                        String marca = scan.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scan.nextLine();
                        System.out.print("Valor: ");
                        double preco = Double.parseDouble(scan.nextLine());

                        Smartphone s = new Smartphone(modelo, marca, preco);
                        lista.add(s);
                        atualizaEstoque(s);
                        System.out.println("\nSmartphone inserido no estoque com sucesso.\n");

                    } catch (NumberFormatException e) {
                        System.out.println("\nEntrada inválida. Retornando ao menu...\n");
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("\nInsira as informações do Laptop a ser inserido:");
                        System.out.print("Marca: ");
                        String marca = scan.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scan.nextLine();
                        System.out.print("Tamanho da tela (em polegadas): ");
                        double tela = Double.parseDouble(scan.nextLine());
                        System.out.print("Valor: ");
                        double preco = Double.parseDouble(scan.nextLine());

                        Laptop l = new Laptop(marca, modelo, tela, preco);
                        lista.add(l);
                        atualizaEstoque(l);
                        System.out.println("\nLaptop inserido no estoque com sucesso.\n");

                    } catch (NumberFormatException e) {
                        System.out.println("\nEntrada inválida. Retornando ao menu...\n");
                    }
                }
                case 3 -> {
                    try{
                        System.out.println("\nInsira as informações do Monitor a ser inserido:");
                        System.out.print("Marca: ");
                        String marca = scan.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scan.nextLine();
                        System.out.print("Tamanho da tela (em polegadas): ");
                        double tela = Double.parseDouble(scan.nextLine());
                        System.out.print("Preço: ");
                        double preco = Double.parseDouble(scan.nextLine());
                        
                        Monitor m = new Monitor(marca, modelo, tela, preco);
                        lista.add(m);
                        atualizaEstoque(m);
                        System.out.println("\nMonitor inserido no estoque com sucesso.\n");
                    }catch(NumberFormatException e){
                        System.out.println("\nEntrada inválida. Retornando ao menu...\n");
                    }
                }
                case 4 -> {
                    try{
                        System.out.println("\nInsira as informações do Teclado Bluetooth a ser inserido:");
                        System.out.print("Marca: ");
                        String marca = scan.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scan.nextLine();
                        System.out.print("Tipo: ");
                        String tipo = scan.nextLine();

                        boolean rgb = false;
                        do{
                            System.out.print("É RGB? (Sim ou Não): ");
                            String temp = scan.nextLine();

                            if(temp.equalsIgnoreCase("sim")){
                                rgb = true;
                                break;
                            }else if(temp.equalsIgnoreCase("não") || temp.equalsIgnoreCase("nao")){
                                break;
                            }else{
                                System.out.println("Entrada inválida. Tente novamente.");
                            }
                        }while(true);

                        System.out.print("Autonomia da bateria (em horas): ");
                        double duracaoBateria = Double.parseDouble(scan.nextLine());
                        System.out.print("Preço: ");
                        double preco = Double.parseDouble(scan.nextLine());
                        
                        Teclado t = new Teclado(marca, modelo, tipo, rgb, preco, duracaoBateria);
                        lista.add(t);
                        atualizaEstoque(t);
                        System.out.println("\nTeclado Bluetooth inserido no estoque com sucesso.\n");
                    }catch(NumberFormatException e){
                        System.out.println("\nEntrada inválida. Retornando ao menu...\n");
                    }
                }
                case 5 -> {
                    try{
                        System.out.println("\nInsira as informações do Fone Bluetooth a ser inserido:");
                        System.out.print("Marca: ");
                        String marca = scan.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scan.nextLine();
                        System.out.print("Autonomia da bateria (em horas): ");
                        double duracaoBateria = Double.parseDouble(scan.nextLine());
                        System.out.print("Preço: ");
                        double preco = Double.parseDouble(scan.nextLine());
                        
                        FoneBluetooth fone = new FoneBluetooth(marca, modelo, preco, duracaoBateria);
                        lista.add(fone);
                        atualizaEstoque(fone);
                        
                        System.out.println("\nFone Bluetooth inserido no estoque com sucesso.\n");
                    }catch(NumberFormatException e){
                        System.out.println("\nEntrada inválida. Retornando ao menu...\n");
                    }
                }
                default -> System.out.println("\nOpção inválida. Retornando ao menu...\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida. Retornando ao menu...\n");
            scan.next();
        } catch(NumberFormatException e){
            System.out.println("\nEntrada inválida. Retornando ao menu...\n");
        }
        
        

    }

    public void removerProduto(){
        if(lista.size()==0){
            System.out.println("\nO estoque está vazio.\n");
        }else{
            imprimirEstoque();
            System.out.print("Digite o número do item a ser removido (0 para cancelar): ");

            try{
                int input = Integer.parseInt(scan.nextLine());

                if(input==0){
                    System.out.println("\nOperação cancelada. Retornando ao menu...\n");
                }else if(input > lista.size()){
                    System.out.println("\nItem inválido. Retornando ao menu...\n");
                }else{
                    input--;
                    lista.remove(input);
                    System.out.println("\nItem removido com sucesso.\n");
                }
            }catch(NumberFormatException e){
                System.out.println("\nEntrada inválida. Retornando ao menu...\n");
            }
        }
    }

    public void listarProdutos(){
        if(lista.isEmpty()){
            System.out.println("\nO estoque está vazio.\n");
        }else {
            imprimirEstoque();
        }
    }
    
 // Novo método para resumir o estoque
    public void resumirEstoque() {
        System.out.println("\nResumo do estoque:\n");
        for (String tipoProduto : qtdEstoque.keySet()) {
            int quantidade = qtdEstoque.get(tipoProduto);
            System.out.println(tipoProduto + ": " + quantidade);
        }
    }

}