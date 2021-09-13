
public class Vendas implements Comparable<Vendas>{
    private Integer quantidade;
    private Integer preco;
    private Long id;

    public Vendas(Integer quantidade, Integer preco, Long id) {
        super();
        this.quantidade =  quantidade ;
        this.preco =  preco ;
        this.id = id;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int compareTo(Vendas v) {
        return this.getId().compareTo(v.getId());
    }

    @Override
    public String toString() {
        return "Vendas [id=" + id + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }     
}

