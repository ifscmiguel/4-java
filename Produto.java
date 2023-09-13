public class Produto {
    
    private static int contador = 0;

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    /**
     * Método construtor
     * @param nome - nome do produto
     * @param preco - preço do produto em reais
     */
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        contador++;
        this.codigo = contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}