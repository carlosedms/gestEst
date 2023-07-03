public class Laptop implements Produto{
    String modelo, marca;
    double preco, tela;

    public Laptop(String marca, String modelo, double tela, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.tela = tela;
        this.preco = preco;
    }

    public String obterModelo(){
        return modelo;
    }

    public double obterPreco(){
        return preco;
    }

    public double obterTamanhoTela(){
        return tela;
    }

    public String toString(){
        return "Tipo: Laptop\nMarca: " + marca + "\nModelo: " + modelo + "\nTamanho da tela: " + String.format("%.1f", tela) + " polegadas\nPreço: R$" + String.format("%.2f", preco) + "\n";
    }
}
