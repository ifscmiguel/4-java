import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    private List<Produto> produtos = new ArrayList<Produto>();
    private int quantidade = 0;
    private double total = 0;


    // fazer um método "imprimirNota"
    // que lista os produtos e respectivos preços
    // a quantidade total de produto 
    // o valor da compra

    public void imprimirNota(){
        System.out.println("\n***********************");
        System.out.println("***** NOTA FISCAL *****");
        System.out.println("***********************");
        // percorre a lista de produtos
        for(int i=0; i<produtos.size(); i++){
            System.out.print(produtos.get(i).getNome());
            System.out.print("      \t");
            System.out.println(produtos.get(i).getPreco());
        }
        System.out.println("***********************");
        System.out.println("QUANTIDADE: "+quantidade);
        System.out.println("TOTAL: R$ "+total);
        System.out.println("***********************\n");
    }

    /**
     * adiciona um produto ao carrinho
     */
    public void addProduto(Produto p){
        quantidade++;
        total += p.getPreco();
        produtos.add(p);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
   
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
