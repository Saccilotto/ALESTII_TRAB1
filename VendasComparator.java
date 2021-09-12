import java.util.Comparator;

public class VendasComparator implements Comparator<Vendas> {
    private char setMode;

    public VendasComparator() {
        super();
    }    

    public VendasComparator(char setMode) {
        super();
        this.setMode = setMode;
    }
    
    public int comparePreco(Vendas s1, Vendas s2) {        
        if (s1.getPreco() < s2.getPreco()) {
            return 1;
        }else if (s1.getPreco() == s2.getPreco()) {
            return 0;
        }else {
            return -1;
        }       
    }

    public int compareQuant(Vendas s1, Vendas s2) {
        if (s1.getQuantidade() < s2.getQuantidade()) {
            return 1;
        }else if (s1.getQuantidade() == s2.getQuantidade()) {
            return 0;
        }else {
            return -1;
        }       
    }

    @Override
    public int compare(Vendas v1, Vendas v2) {
        int comparedPreco;
        int comparedQuant;

        if (setMode == 'P') {
            comparedPreco = comparePreco(v1, v2);
            return comparedPreco;
        } else if (setMode == 'Q') {
            comparedQuant = compareQuant(v1, v2);
            return comparedQuant;
        }else{
            throw new IllegalArgumentException("setMode char attribute must be set to 'P'(Preco) or 'Q'(Quantidade).");
        }
    }

    public void setMode(char mode){
        setMode = mode;
    }
}
