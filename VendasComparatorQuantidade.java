import java.util.Comparator;

public class VendasComparatorQuantidade implements Comparator<Vendas> {

    @Override
    public int compare(Vendas a, Vendas b) throws ClassCastException {
        return a.getQuantidade().compareTo(b.getQuantidade());
        
    }
}

