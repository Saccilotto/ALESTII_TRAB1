public class Transacao implements Comparable<Transacao> {
    private char type;
    private int quantidade;
    private int preco;
    private Integer id;
    private TransacaoPrecoComparator compareToPreco = new TransacaoPrecoComparator();
    private TransacaoQuantidadeComparator compareToQuantidade = new TransacaoQuantidadeComparator();

    public Transacao(char type, int quantidade, int preco, int id) {
        super();
        this.type = type;;
        this.quantidade = quantidade;
        this.preco = preco;
        this.id = id;
    }


    public int getType() {
        return type;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Integer getId(){
        return id;
    }

    public void setPreco(int c) {
        quantidade = c;
    }

    public void setQuantidade(int c) {
        quantidade = c;
    }

    public int compareToPreco(Transacao c) {
        return this.getCompareToPreco().compare(this, c);
    }

    public int compareToQuantidade(Transacao c) {
        return this.getCompareToQuantidade().compare(this, c);   
    }


    public TransacaoPrecoComparator getCompareToPreco (){
        return compareToPreco;
    }

    public TransacaoQuantidadeComparator getCompareToQuantidade (){
        return compareToQuantidade;
    }

    @Override
    public int compareTo(Transacao c) {
        return this.getId().compareTo(c.getId());
    }
    
    @Override
    public String toString() {
        return "Vendas [id=" + id + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }
}
