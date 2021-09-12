import java.util.Comparator;

public class VendasQuantidadeComparator implements Comparator<Vendas> {

    public int compare(Vendas s1, Vendas s2) {
        if (s1.getQuantidade() < s2.getQuantidade()) {
            return 1;
        }else if (s1.getQuantidade() == s2.getQuantidade()) {
            return 0;
        }else {
            return -1;
        }       
    }
}
