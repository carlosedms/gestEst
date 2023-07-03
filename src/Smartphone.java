public class Smartphone implements Produto{
    String modelo, marca;
    double preco;

    public Smartphone(String modelo, String marca, double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String obterModelo(){
        return modelo;
    }

    public double obterPreco(){
        return preco;
    }

    public String obterMarca(){
        return marca;
    }

    public String toString() {
        return "Tipo: Smartphone\nMarca: " + marca + "\nModelo: " + modelo + "\nPreço: R$" + String.format("%.2f", preco) + "\n";
    }
}
