
public class Vendas implements Comparable<Vendas>{
    private int quantidade;
    private int preco;
    private Long id;
    private VendasPrecoComparator compareToPreco = new VendasPrecoComparator();
    private VendasQuantidadeComparator compareToQuantidade = new VendasQuantidadeComparator();

    public Vendas(int quantidade, int preco, Long id) {
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

    public VendasPrecoComparator getCompareToPreco (){
        return compareToPreco;
    }

    public VendasQuantidadeComparator getCompareToQuantidade (){
        return compareToQuantidade;
    }

    @Override
    public int compareTo(Vendas v) {
        return this.getId().compareTo(v.getId());
    }

    public int compareToPreco(Vendas c) {
        return this.getCompareToPreco().compare(this, c);
    }

    public int compareToQuantidade(Vendas c) {
        return this.getCompareToQuantidade().compare(this, c);   
    }   

    @Override
    public String toString() {
        return "Vendas [id=" + id + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }     
}

