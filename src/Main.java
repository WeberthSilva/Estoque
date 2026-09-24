public class Main {
    public static void main(String[] args) {



        Estoque estoque = new Estoque();
        Produto produto = new Produto("mouse", 101, 59.99, 10);
        Produto produto1 = new Produto("teclado", 200, 45.88, 20);
        Produto produto2 = new Produto("caixa de som", 330,99.99, 30);
        Produto produto3 = new Produto("fone", 404, 25, 39);

        estoque.adicionarProduto(produto);
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        estoque.adicionarProduto(produto);
        estoque.adicionarProduto(produto2);

    }
}
