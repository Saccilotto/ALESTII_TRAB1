import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {  
    public static void main (String args[]) {

        Heap heaperBuy =  new Heap(1000000);
        Heap heaperSell =  new Heap(1000000);
       
        char label = 'z';
        Integer quantidade = 0, preco = 0;
        //numOperations = 0
        String path =  System.getProperty("user.dir") + "/instancias/30.txt";
        String tokens[] = new String[3];

        //ChronoLocalDateTime date0 = LocalDateTime.from(ZonedDateTime.now());
        try {
            File instances = new File(path);
            Scanner readerScan = new Scanner(instances);
            //String aux = readerScan.nextLine();
            //numOperations = Integer.parseInt(aux);

            while(readerScan.hasNextLine()) {
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
                if(label == 'V') {
                    Compras compra = new Compras(quantidade, preco);
                    heaperBuy.add(compra);
                }
                if(label == 'C') {
                    Vendas venda = new Vendas(quantidade, preco);
                    heaperSell.add(venda);
                }
            }
            readerScan.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        //ChronoLocalDateTime date1 = LocalDateTime.from(ZonedDateTime.now());
        //double time = date0 - date1;
        //System.out.println(time);
    }

}
