
public class Compras implements Comparable<Compras>{
    private int quantidade;
    private int preco;
    private Long id;

    public Compras(int quantidade, int preco, Long id) {
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
            Compras other = (Compras) obj;
        if (id != other.id)
            return false;
        return true;
    }
    */
}
