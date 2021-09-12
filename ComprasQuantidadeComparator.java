import java.util.Comparator;

public class ComprasQuantidadeComparator implements Comparator<Compras> {

    public int compare(Compras s1, Compras s2) {
        if (s1.getQuantidade() < s2.getQuantidade()) {
            return 1;
        }else if (s1.getQuantidade() == s2.getQuantidade()) {
            return 0;
        }else {
            return -1;
        }       
    }
}

