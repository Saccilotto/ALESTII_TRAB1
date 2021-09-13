import java.util.Comparator;

class VendasComparatorQuantidade implements Comparator<Vendas> {

    @Override
    public int compare(Vendas a, Vendas b) throws ClassCastException {
        if (a.getQuantidade() < b.getQuantidade()) {
            return 1;
        }else if (a.getQuantidade() == b.getQuantidade()) {
            return 0;
        }else {
            return -1;
        }   
    }
}

