public class Smartphone implements Produto{
    String nome, marca;
    double preco;

    public Smartphone(String nome, String marca, double preco){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String obterNome(){
        return nome;
    }

    public double obterPreco(){
        return preco;
    }

    public double calcularDesconto(double valorTot){
        return valorTot-(valorTot/5);
    }

    public String obterMarca(){
        return marca;
    }

    public String toString() {
        return "Tipo: Smartphone\nNome: " + nome + "\nMarca: " + marca + "\nPreço: R$" + String.format("%.2f", preco) + "\n";
    }
}
