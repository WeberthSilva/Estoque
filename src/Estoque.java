import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estoque {
    List<Produto> produtos;


    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        boolean existe = false;
        for (Produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                System.out.println("codigo ja existe");
                existe = true;
            }
        }
        if (existe) {
        } else {
            System.out.println("adicionar");
            produtos.add(produto);
        }
    }

    public Produto buscarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutosCadastrados() {
        for (Produto p : produtos) {
            System.out.println(p);

        }
    }

    public void adicionarEstoque(int codigo, int quantidade) {
        Produto produto = buscarProduto(codigo);
        produto.setQuantidade(quantidade + produto.getQuantidade());
        System.out.println(produto.getQuantidade());


    }


}

