

public class Compras {
    private int quantidade;
    private int preco;
    private int id;

    public Compras(Integer quantidade, Integer preco, int id) {
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
    public int getId(){
        return id;
    }
}
