import java.util.Comparator;

public class TransacaoPrecoComparator implements Comparator<Transacao> {
    public int compare(Transacao s1, Transacao s2) {
        if (s1.getPreco() < s2.getPreco()) {
            return 1;
        }else if (s1.getPreco() == s2.getPreco()) {
            return 0;
        }else {
            return -1;
        }       
    }
}
