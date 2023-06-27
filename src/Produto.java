public interface Produto {
    public String obterNome();

    public double obterPreco();

    public double calcularDesconto(double valorTot);

    public String toString(); // Sobrescrever o método toString da classe Java permite uma maneira mais fácil de retornar toodo o conteúdo dos objetos
}