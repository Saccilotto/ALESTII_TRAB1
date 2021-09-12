import java.util.Comparator;

public class ComprasPrecoComparator implements Comparator<Compras> {

    public int compare(Compras s1, Compras s2) {
        if (s1.getPreco() < s2.getPreco()) {
            return 1;
        }else if (s1.getPreco() == s2.getPreco()) {
            return 0;
        }else {
            return -1;
        }       
    }
}

