import java.util.Comparator;


class ComparatorDda implements Comparator<Empregado>{
    public int compare(Empregado a, Empregado b) throws ClassCastException {
        return a.getDdn().compareTo(b.getDdn());
    }
}
