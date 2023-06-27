public class Laptop implements Produto{
    String modelo;
    double preco, tela;

    public Laptop(String modelo, double tela, double preco){
        this.modelo = modelo;
        this.tela = tela;
        this.preco = preco;
    }

    public String obterNome(){
        return modelo;
    }

    public double obterPreco(){
        return preco;
    }

    public double obterTamanhoTela(){
        return tela;
    }

    public double calcularDesconto(double valorTot){
        return valorTot-(valorTot/5);
    }

    public String toString(){
        return "Tipo: Laptop\nModelo: " + modelo + "\nTamanho da tela: " + tela + " polegadas\nPreço: R$" + String.format("%.2f", preco) + "\n";
    }
}
