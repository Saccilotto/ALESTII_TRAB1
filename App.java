import java.io.File;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class App {  
    public static void main (String args[]) {
        final int OPERATIONS = 30;

        Map<Integer, Compras> compras = new HashMap<Integer, Compras>(OPERATIONS);
        Map<Integer, Vendas> vendas = new HashMap<Integer, Vendas>(OPERATIONS);

        char label = 'z';
        Integer quantidade = 0, preco = 0;
        String path =  System.getProperty("user.dir") + "/instancias/" + OPERATIONS + ".txt";
        String tokens[] = new String[3];
        
        //ChronoLocalDateTime date0 = LocalDateTime.from(ZonedDateTime.now());
        try {
            File instances = new File(path);
            Scanner readerScan = new Scanner(instances);
            Integer cont = 0;
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
                if(label == 'C') {
                    Compras compra = new Compras(quantidade, preco, cont);
                    compras.put(compra.hashCode(), compra);
                    cont++;
                }
                if(label == 'V') {
                    Vendas venda = new Vendas(quantidade, preco, cont);
                    vendas.put(venda.hashCode(), venda);
                    cont++;
                }
            }
            readerScan.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
        int comprasTotal = 0;

        Set entrySet = compras.entrySet();
        Iterator itComp = entrySet.iterator();
        while(itComp.hasNext()) {
            Map.Entry me = (Map.Entry)itComp.next();
            comprasTotal = me.getValue();
        }
        //ChronoLocalDateTime date1 = LocalDateTime.from(ZonedDateTime.now());
        //double time = date0 - date1;
        //System.out.println(time);
    }

     

}
