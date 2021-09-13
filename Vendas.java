
public class Vendas implements Comparable<Vendas>{
    private Integer quantidade;
    private Integer preco;
    private Long id;

    public Vendas(Integer quantidade, Integer preco, Long id) {
        super();
        quantidade = this.quantidade;
        preco = this.preco;
        id = this.id;
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
    /*
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    } 
    
    public String toString() {
        return new StringBuilder(this.getClass().getName()).append("#")
        .append(this.getId()).toString();
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
            Vendas other = (Vendas) obj;
        if (id != other.id)
            return false;
        return true;
    }
     */         
}

