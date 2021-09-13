import java.util.Comparator;


class ComparatorNome implements Comparator<Empregado>{
    public int compare(Empregado a, Empregado b) throws ClassCastException {
        return a.getNome().compareTo(b.getNome());
    }
}
