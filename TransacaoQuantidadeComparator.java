import java.util.Comparator;

public class TransacaoQuantidadeComparator implements Comparator<Transacao> {
    public int compare(Transacao s1, Transacao s2) {
        if (s1.getQuantidade() < s2.getQuantidade()) {
            return 1;
        }else if (s1.getQuantidade() == s2.getQuantidade()) {
            return 0;
        }else {
            return -1;
        }       
    }
}

