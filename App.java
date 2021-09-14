import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class App {  
    public static void main (String args[]) {
        final int OPERATIONS = 30;

        MaxHeap compras = new MaxHeap(OPERATIONS); 
        MinHeap vendas = new MinHeap(OPERATIONS); 
        
        int quantidade = 0, preco = 0;
        String path = System.getProperty("user.dir") + "/instancias/teste.txt";
        String tokens[] = new String[3];
        
        //ChronoLocalDateTime date0 = LocalDateTime.from(ZonedDateTime.now());
        try {
            File instances = new File(path);
            Scanner readerScan = new Scanner(instances);
            //Long cont;
            char label = '0';
            while(readerScan.hasNextLine()) {
                int cont = 0;
                String data = readerScan.nextLine();
                if(data.equals("q")) {
                    break;
                }
                tokens = data.split(" ");
                if(tokens.length == 3) {
                    label = tokens[0].charAt(0);
                    quantidade = Integer.parseInt(tokens[1]);
                    preco = Integer.parseInt(tokens[2]);
                }
                if(label == 'C') {
                    Compras compra = new Compras(quantidade, preco, (long) cont);
                    compras.add(compra);
                    cont++;
                }
                if(label == 'V') {
                    Vendas venda = new Vendas(quantidade, preco, (long) cont);
                    vendas.add(venda);
                    cont++;
                }
                
            }
            readerScan.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
        // ==================================================

        
         // Fila de Prioridade sobre Comprass com a ordenação natural.
         System.out.println("Fila de Prioridade sobre Comprass com a ordenação natural (sobre ids).");
         Queue<Compras> PQComprassNatural = new PriorityQueue<Compras>();

         for (Compras e : compras.getHeap()){
             PQComprassNatural.add(e);
         }
 
        // while(!PQComprassNatural.isEmpty())
        // {
        //     Compras e = PQComprassNatural.poll();
        //     System.out.println(e);
        // }
 
         // Fila de Prioridade sobre Comprass com a ordenação sobre qauntidade.
         System.out.println("Fila de Prioridade sobre Comprass com a ordenação sobre nomes.");
         Queue<Compras> PQComprasPreco = new PriorityQueue<>(new ComprasPrecoComparator());
 
         for (Compras e : compras.getHeap()){
             PQComprasPreco.add(e);
         }
         
        // while(!PQComprasPreco.isEmpty())
        // {
        //     Compras e = PQComprasPreco.poll();
        //     System.out.println(e);
        // }Vendas
 
         // Fila de Prioridade sobre Comprass com a ordenação sobre preco.
         System.out.println("Fila de Prioridade sobre Comprass com a ordenação sobre dia de aniversário.");
         Queue<Compras> PQComprasQuantidade = new PriorityQueue<>(new ComprasQuantidadeComparator());
 
        for (Compras e : compras.getHeap()){
            PQComprasQuantidade.add(e);
        }
 
        // while(!PQComprasQuantidade.isEmpty())
        // {
        //     Compras e = PQComprasQuantidade.poll();
        //     System.out.println(e);
        // }

        // Fila de Prioridade sobre Comprass com a ordenação natural.
        System.out.println("Fila de Prioridade sobre Comprass com a ordenação natural (sobre ids).");
        Queue<Vendas> vendasPQ = new PriorityQueue<Vendas>();
        
        for (Vendas e : vendas.getHeap()){
            vendasPQ.add(e);
        }

        // while(!PQComprassNatural.isEmpty())
        // {
        //     Compras e = PQComprassNatural.poll();
        //     System.out.println(e);
        // }

        // Fila de Prioridade sobre Comprass com a ordenação sobre qauntidade.
        System.out.println("Fila de Prioridade sobre Comprass com a ordenação sobre nomes.");
        Queue<Vendas> vendasQauntidadePQ = new PriorityQueue<Vendas>(new VendasPrecoComparator());

        for (Vendas e : vendas.getHeap()){
            vendasQauntidadePQ.add(e);
        }

        // while(!PQComprasPreco.isEmpty())
        // {
        //     Compras e = PQComprasPreco.poll();
        //     System.out.println(e);
        // }

        // Fila de Prioridade sobre Comprass com a ordenação sobre preco.
        System.out.println("Fila de Prioridade sobre Comprass com a ordenação sobre dia de aniversário.");
        Queue<Vendas> PQVendasPreco  = new PriorityQueue<Vendas>(new VendasPrecoComparator());

        for (Vendas e : vendas.getHeap()){
            PQVendasPreco.add(e);
        }

        int lucro = 0;
        int negociadas = 0;
        Compras precoOrdemC = PQComprasPreco.peek();
        Compras quantidadeOrdemC = PQComprasQuantidade.peek();

        Vendas  precoOrdemV  = PQVendasPreco.peek();
        Vendas  quantidadeOrdemV  = vendasQauntidadePQ.peek();
        while(! (precoOrdemC.equals(null) || quantidadeOrdemC.equals(null) || (precoOrdemV.equals(null) || quantidadeOrdemV.equals(null)))) {

            if (precoOrdemC )
            for () {
                
            }
            
            
        }


        // while(!PQComprasQuantidade.isEmpty())
        // {
        //     Compras e = PQComprasQuantidade.poll();
        //     System.out.println(e);
        // }
        
        
     }
}
