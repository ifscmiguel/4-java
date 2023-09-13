/*
 * Avaliação PDM 2023
 * 
 * Utilizando como base os projetos "Aposentadoria" ou "Carrinho de Compras" crie uma nova funcionalidade em um destes projetos.
 * 
 * Coloque na forma de comentário do arquivo inicial 
 * a explicação do objetivo da sua funcionalidade.
 * 
 * Sua funcionalidade não deve ser a mesma de algum colega ao lado.
 * Enviar pasta zipada via sigaa.
 * 
 * Não é permitido pesquisar na web ou utilizar geradores de código.
 * 
 */

class Inicio{
    public static void main(String[] args) {
        
        // produtos
        Produto p1 = new Produto("Maça", 2);
        Produto p2 = new Produto("Vassoura", 50);
        Produto p3 = new Produto("Melancia", 5.99);
        Produto p4 = new Produto("Banana", 3.95);
        Produto p5 = new Produto("Mamão", 8);
        Produto p6 = new Produto("Tomate", 6.50);
        Produto p7 = new Produto("Sal", 1.99);
        Produto p8 = new Produto("Café", 12.65);

        // carrinhos
        Carrinho c1 = new Carrinho();
        c1.addProduto(p8);
        c1.addProduto(p2);
        c1.addProduto(p7);
        c1.imprimirNota();

        Carrinho c2 = new Carrinho();
        c2.addProduto(p3);
        c2.addProduto(p3);
        c2.addProduto(p3);
        c2.addProduto(p5);
        c2.addProduto(p4);
        c2.imprimirNota();


        /*
         * Uma classe que represente um carrinho de compras
         */

    }
}