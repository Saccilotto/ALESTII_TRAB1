import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {  
    public static void main (String args[]) {
       
        char label = 'z';
        Integer numOperations = 0, quantidade = 0, preco = 0;
        
        String path =  System.getProperty("user.dir") + "/instancias/30.txt";
        String tokens[] = new String[3];

        //ChronoLocalDateTime date0 = LocalDateTime.from(ZonedDateTime.now());
        try {
            File instances = new File(path);
            Scanner readerScan = new Scanner(instances);
            String aux = readerScan.nextLine();
            numOperations = Integer.parseInt(aux);
            Map<Integer, Integer> compras = new HashMap<Integer, Integer>(numOperations); 
            Map<Integer, Integer> vendas = new HashMap<Integer, Integer>(numOperations);    
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
                    vendas.put(quantidade, preco);
                }
                if(label == 'C') {
                    compras.put(quantidade, preco);
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
