import java.util.ArrayList;
import java.util.List;

public class MaxHeap {  
    private List<Compras> heaplist;

    MaxHeap() {
        heaplist = new ArrayList<Compras>();
    }

    MaxHeap(int tam) {
        heaplist = new ArrayList<Compras>(tam);
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int parent(int i) {
        if (i % 2 == 1) {
            return i / 2;
        }
        return (i - 1) / 2;
    }

    private void heapify_up(int i) {
        if(i > 0) {
            int parent = parent(i);
            if(heaplist.get(i).compareTo(heaplist.get(parent)) < 0){
                swap(i, parent);
                heapify_up(parent);
            }
        }
    }

    private void heapify_down(int i) {
        int left = left(i), right = right(i), higher = -1;

        if(left <= heaplist.size()-1 && heaplist.get(left).compareTo(heaplist.get(i)) < 0) {
            higher = left;
        } else {
            higher = i;
        }

        if(right <= heaplist.size() - 1 &&  heaplist.get(right).compareTo(heaplist.get(higher)) < 0) {
            higher = right;
        }
        if(higher != i) {
            swap(i, higher);
            heapify_down(higher);
        }
    }

    private void swap(int i, int parent) {
        Compras temp = heaplist.get(parent);
        heaplist.set(parent, heaplist.get(i));
        heaplist.set(i, temp);
    }

    /**
     * Insere um valor inteiro no heap.
     * @param n o número a ser inserido.
     */
    public void add(Compras n) {         // equivalente ao método inserts
        heaplist.add(n);
        heapify_up(heaplist.size() - 1);
    }

     /**
     * Método para a remoção e retorno do menor elemento do heap. Caso o heap esteja vazio, um valor null deve ser retornado.
     * @return o menor valor do heap.
     */
    public Compras poll() {        // equivalente ao método extract_min()
        Compras raiz = null;
        if (heaplist.size() == 0) {
            throw new IllegalStateException("MaxHeap is empty.");
        } else if(heaplist.size() == 1) {
            raiz = heaplist.remove(0);
            return raiz;
        }

        raiz = heaplist.get(0);
        Compras last = heaplist.remove(heaplist.size() - 1);
        heaplist.set(0, last);
        heapify_down(0);
        return raiz;
    }

    /**
     * Método que acessa e retorna do menor elemento do heap. Caso o heap esteja vazio, um valor null deve ser retornado.
     * @return o menor valor do heap.
     */
    public Compras peek() {       // equivalente ao método min()
        if (heaplist.size() > 0) {
            return heaplist.get(0);
        }
        else {
            return null;
        }
        // return tamanho == 0 ? null : heap[0];
    }

    /**
     * Retorna o tamanho do heap em número de elementos dentro do heap.
     * @return number of items
     */
    public int length() {
        return heaplist.size();
    }

    /**
     * Testa se o heap é vazio.
     * @return true caso o heap esteja vazio, false caso contrário.
     */
    public boolean isEmpty() {
        return heaplist.size() == 0;
    }

    public List<Compras> getHeap (){ 
        return heaplist;
    }
}

