import java.time.LocalDate;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ExemploPriorityQueue
{
    public static void main(String[] args)
    {
        final int PQSIZE = 20;
        // Fila de Prioridade de minheap sobre inteiros.
        System.out.println("Fila de Prioridade baseada em minheap de inteiros.");

        Queue<Integer> integerPriorityQueue = new PriorityQueue<>();
        Random rand = new Random();
        // Insere
        for(int i=0; i<PQSIZE; i++){
            Integer in = rand.nextInt(100);
            integerPriorityQueue.add(in);
            System.out.println("Adicionando o inteiro:" + in);
        }
        for(int i=0; i<PQSIZE; i++){
            Integer in = integerPriorityQueue.poll();
            System.out.println("Extraindo o inteiro:" + in);
        }

        // Fila de Prioridade de maxheap sobre inteiros.
        System.out.println("Fila de Prioridade baseada em maxheap de inteiros.");
        Queue<Integer> integerPriorityQueueMax = new PriorityQueue<>((n1, n2) -> n2 - n1);

        for(int i=0; i<PQSIZE; i++){
            Integer in = rand.nextInt(100);
            integerPriorityQueueMax.add(in);
            System.out.println("Adicionando o inteiro:" + in);
        }
        for(int i=0; i<PQSIZE; i++){
            Integer in = integerPriorityQueueMax.poll();
            System.out.println("Extraindo o inteiro:" + in);
        }

        // Cria 5 empregados com atributos arbitrários
        Empregado[] empregados = new Empregado[5];
        empregados[0] = new Empregado(1l, "RRR", LocalDate.parse("1915-01-02"));
        empregados[2] = new Empregado(5l, "BBB", LocalDate.parse("1914-02-23"));
        empregados[1] = new Empregado(4l, "TTT", LocalDate.parse("1918-11-03"));
        empregados[3] = new Empregado(2l, "FFF", LocalDate.parse("1920-12-15"));
        empregados[4] = new Empregado(3l, "AAA", LocalDate.parse("1980-04-14"));

        // Fila de Prioridade sobre empregados com a ordenação natural.
        System.out.println("Fila de Prioridade sobre empregados com a ordenação natural (sobre ids).");
        Queue<Empregado> PQEmpregadosNatural = new PriorityQueue<>();

        for (Empregado e : empregados){
            PQEmpregadosNatural.add(e);
        }

        while(!PQEmpregadosNatural.isEmpty())
        {
            Empregado e = PQEmpregadosNatural.poll();
            System.out.println(e);
        }

        // Fila de Prioridade sobre empregados com a ordenação sobre nomes.
        System.out.println("Fila de Prioridade sobre empregados com a ordenação sobre nomes.");
        //Queue<Empregado> PQEmpregadosNome = new PriorityQueue<>(new ComparatorNome());
        Queue<Empregado> PQEmpregadosNome = new PriorityQueue<>((n1, n2) -> n1.getNome().compareTo(n2.getNome()));

        for (Empregado e : empregados){
            PQEmpregadosNome.add(e);
        }

        while(!PQEmpregadosNome.isEmpty())
        {
            Empregado e = PQEmpregadosNome.poll();
            System.out.println(e);
        }

        // Fila de Prioridade sobre empregados com a ordenação sobre nomes.
        System.out.println("Fila de Prioridade sobre empregados com a ordenação sobre dia de aniversário.");
        //Queue<Empregado> PQEmpregadosDda = new PriorityQueue<>(new ComparatorDda());
        Queue<Empregado> PQEmpregadosDda = new PriorityQueue<>((d1, d2) -> d1.getDdn().compareTo(d2.getDdn()));

        for (Empregado e : empregados){
            PQEmpregadosDda.add(e);
        }

        while(!PQEmpregadosDda.isEmpty())
        {
            Empregado e = PQEmpregadosDda.poll();
            System.out.println(e);
        }
    }
}
