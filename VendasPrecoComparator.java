import java.util.Comparator;

public class VendasPrecoComparator implements Comparator<Vendas> {

    public int compare(Vendas s1, Vendas s2) {
        if (s1.getPreco() < s2.getPreco()) {
            return 1;
        }else if (s1.getPreco() == s2.getPreco()) {
            return 0;
        }else {
            return -1;
        }       
    }
}

