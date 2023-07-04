public class FoneBluetooth implements Produto{
    String modelo, marca;
    double preco, duracaoBateria;

    public FoneBluetooth(String modelo, String marca, double preco, double duracaoBateria){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.duracaoBateria = duracaoBateria;
    }

    public String obterModelo(){
        return modelo;
    }

    public double obterPreco(){
        return preco;
    }

    public String toString(){
        return "Tipo: Fone Bluetooth\nMarca: " + marca + "\nModelo: " + modelo + "\nTempo de duração da bateria: " + duracaoBateria + " horas\nPreço: R$" + String.format("%.2f", preco) + "\n";
    }
}
