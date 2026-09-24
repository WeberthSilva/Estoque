
public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0 ){
            System.out.println("ERRO : Valor invalido ");
        }else
            this.quantidade = quantidade;

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0 ){
            System.out.println("ERRO: Preço ivalido");
        }else
            this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
