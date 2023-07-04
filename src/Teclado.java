public class Teclado implements Produto{
    String modelo, marca, tipo;
    boolean rgb;
    double preco, duracaoBateria;

    public Teclado(String modelo, String marca, String tipo, boolean rgb, double preco, double duracaoBateria){
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.rgb = rgb;
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
        if(rgb){
            return "Tipo: Teclado Bluetooth\nMarca: " + marca + "\nModelo: " + modelo + "\nTipo de teclado: " + tipo + "\nRGB: Sim" + "\nTempo de duração da bateria: " + duracaoBateria + " horas\nPreço: R$" + String.format("%.2f", preco) + "\n";
        }else{
            return "Tipo: Teclado Bluetooth\nMarca: " + marca + "\nModelo: " + modelo + "\nTipo de teclado: " + tipo + "\nRGB: Não" + "\nTempo de duração da bateria: " + duracaoBateria + " horas\nPreço: R$" + String.format("%.2f", preco) + "\n";
        }
    }
}
