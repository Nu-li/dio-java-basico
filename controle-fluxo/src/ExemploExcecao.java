import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        //não pede tratamento de erro
        /*Number valor = Double.valueOf("a1.75");
        System.out.println(valor);
        */

        //pede tratamento de erro com try catch
        /*Number valor = Double.valueOf("a1.75");
        valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);*/

        //try catch
        Number valor;
        try {
            
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        
        } catch (ParseException e) {
            e.printStackTrace();
        }
       
    }
}
