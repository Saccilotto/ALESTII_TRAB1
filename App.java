import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.Op;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class App {  
    public static void main (String args[]) {
        final int OPERATIONS = 30;

        List<Transacao> reader = new ArrayList<Transacao>(OPERATIONS);

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
                    Transacao compra = new Transacao(label ,quantidade, preco, cont);
                    reader.add(compra);
                    cont++;
                }
                if(label == 'V') {
                    Transacao venda = new Transacao(label, quantidade, preco, cont);
                    reader.add(venda);
                    cont++;
                } 
            }
            readerScan.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
     
        //Queue<Transacao> queueTransactionId = new PriorityQueue<Transacao>(OPERATIONS);
        Queue<Transacao> queueTransactionPreco = new PriorityQueue<Transacao>(new TransacaoPrecoComparator());
        Queue<Transacao> queueTransactionQuantidades = new PriorityQueue<Transacao>(new TransacaoQuantidadeComparator().reverseOrder(comparing(String::length));
   
        for (Transacao e : reader) {
            //queueTransactionId.add(e);
            queueTransactionPreco.add(e);
            queueTransactionQuantidades.add(e);
        }

        int lucroTotal = 0;
        int loopCount = 0;
        while (true) {
            Transacao aux = reader.get(loopCount);
            //queueTransactionPreco
            
            loopCount++;
        }    
       /*  while (!queueTransactionId.isEmpty()) {
            int lucroAux = 0;
            int pointer = 0;
            if (queueTransactionId.peek().getType() == 'C') {
                Transacao aux = queueTransactionId.poll();
                //aux = queueTransactionId.forEach(x -> x.compareTo(c));
                for (int i = 0;i < OPERATIONS; i++) {
                    if (queueTransactionId.peek().getType() == 'V') {
                        if(aux.getPreco() <= queueTransactionId.peek().getPreco()){

                            if (aux.getQuantidade() < queueTransactionId.peek().getQuantidade()) {
                                int temp = queueTransactionId.peek().getQuantidade() - aux.getQuantidade();
                                queueTransactionId.peek().setQuantidade(temp);
                                aux  = null; 
                                if (queueTransactionId.peek().getQuantidade() <= 0) {
                                    queueTransactionId.poll();
                                }   
                            }else if (aux.getQuantidade() == queueTransactionId.peek().getQuantidade()) {

                            } else {

                            }
                            
                        }

                    }else {

                    }
                }
            } else if (queueTransactionId.peek().getType() == 'V') {
                
            }

            
            lucroTotal += lucroAux;
        }   
 */


        // ==================================================
        //Queue<Transacao> queueTransactionIdCompra = new PriorityQueue<Transacao>(OPERATIONS);
        //for (Transacao e : reader) {
        //    if(e.getType() == 'C') {
        //        queueTransactionIdCompra.add(e);
        //    }
        //}   

        //Queue<Transacao> queueTransactionIdVenda = new PriorityQueue<Transacao>(OPERATIONS);
        //for (Transacao e : reader) {
        //    queueTransactionId.add(e);
        //}   
    }
}


    




        //Queue<Transacao> queueTransactionPreco = new PriorityQueue<>(new TransacaoPrecoComparator());
 
        // for (Transacao e : Transacao.getHeap()){
        //     PQTransacaoPreco.add(e);
        // }
         
        // while(!PQTransacaoPreco.isEmpty())
        // {
        //     Transacao e = PQTransacaoPreco.poll();
        //     System.out.println(e);
        // }Transacao
 
         // Fila de Prioridade sobre Transacaos com a ordenação sobre preco.
        // System.out.println("Fila de Prioridade sobre Transacaos com a ordenação sobre dia de aniversário.");
        // Queue<Transacao> PQTransacaoQuantidade = new PriorityQueue<>(new TransacaoQuantidadeComparator());
 
        //for (Transacao e : Transacao.getHeap()){
        //    PQTransacaoQuantidade.add(e);
       // }
 
        // while(!PQTransacaoQuantidade.isEmpty())
        // {
        //     Transacao e = PQTransacaoQuantidade.poll();
        //     System.out.println(e);
        // }

        // Fila de Prioridade sobre Transacaos com a ordenação natural.
        //System.out.println("Fila de Prioridade sobre Transacaos com a ordenação natural (sobre ids).");
        //Queue<Transacao> TransacaoPQ = new PriorityQueue<Transacao>();
        
        //for (Transacao e : Transacao.getHeap()){
        //    TransacaoPQ.add(e);
        //}

        // while(!PQTransacaosNatural.isEmpty())
        // {
        //     Transacao e = PQTransacaosNatural.poll();
        //     System.out.println(e);
        // }

        // Fila de Prioridade sobre Transacaos com a ordenação sobre qauntidade.
        //System.out.println("Fila de Prioridade sobre Transacaos com a ordenação sobre nomes.");
        //Queue<Transacao> TransacaoQauntidadePQ = new PriorityQueue<Transacao>(new TransacaoPrecoComparator());

        //for (Transacao e : Transacao.getHeap()){
        //    TransacaoQauntidadePQ.add(e);
       ///*  */ }

        // while(!PQTransacaoPreco.isEmpty())
        // {
        //     Transacao e = PQTransacaoPreco.poll();
        //     System.out.println(e);
        // }

       /*  // Fila de Prioridade sobre Transacaos com a ordenação sobre preco.
        System.out.println("Fila de Prioridade sobre Transacaos com a ordenação sobre dia de aniversário.");
        Queue<Transacao> PQTransacaoPreco  = new PriorityQueue<Transacao>(new TransacaoPrecoComparator());

        for (Transacao e : Transacao.getHeap()){
            PQTransacaoPreco.add(e);
        }

        int lucro = 0;
  /*       int negociadas = 0; */
     /*    Transacao precoOrdemC = PQTransacaoPreco.peek();
        Transacao quantidadeOrdemC = PQTransacaoQuantidade.peek();

        Transacao  precoOrdemV  = PQTransacaoPreco.peek();
        Transacao  quantidadeOrdemV  = TransacaoQauntidadePQ.peek();
        while(! (precoOrdemC.equals(null) || quantidadeOrdemC.equals(null) || (precoOrdemV.equals(null) || quantidadeOrdemV.equals(null)))) {
            if (precoOrdemC != null) {
                for () {
                    
                }
            }
        } */
            
             
        


        // while(!PQTransacaoQuantidade.isEmpty())
        // {
        //     Transacao e = PQTransacaoQuantidade.poll();
        //     System.out.println(e);
        // }
        
        
     

