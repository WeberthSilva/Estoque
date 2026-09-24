
import java.sql.SQLOutput;
import java.util.ArrayList;
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

        }else{
            System.out.println("adicionar");
                produtos.add(produto);
        }

    }

}

