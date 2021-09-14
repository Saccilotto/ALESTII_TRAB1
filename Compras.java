
public class Compras implements Comparable<Compras>{
    private int quantidade;
    private int preco;
    private Long id;
    private ComprasPrecoComparator compareToPreco = new ComprasPrecoComparator();
    private ComprasQuantidadeComparator compareToQuantidade = new ComprasQuantidadeComparator();

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

    public ComprasPrecoComparator getCompareToPreco (){
        return compareToPreco;
    }

    public ComprasQuantidadeComparator getCompareToQuantidade (){
        return compareToQuantidade;
    }

    @Override
    public int compareTo(Compras c) {
        return this.getId().compareTo(c.getId());
    }

    public int compareToPreco(Compras c) {
        return this.getCompareToPreco().compare(this, c);
    }

    public int compareToQuantidade(Compras c) {
        return this.getCompareToQuantidade().compare(this, c);   
    }
    
    @Override
    public String toString() {
        return "Vendas [id=" + id + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
}
