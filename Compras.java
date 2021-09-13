
public class Compras implements Comparable<Compras>{
    private int quantidade;
    private int preco;
    private Long id;

    public Compras(int quantidade, int preco, Long id) {
        super();
        this.quantidade = quantidade;
        this.preco = preco;
        this.id = id;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Long getId(){
        return id;
    }

    @Override
    public int compareTo(Compras c) {
        return this.getId().compareTo(c.getId());
    }
    
    @Override
    public String toString() {
        return "Vendas [id=" + id + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
}
