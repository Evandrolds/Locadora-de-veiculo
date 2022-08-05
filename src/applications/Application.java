package applications;

import entities.AluguelCarro;
import entities.Recibo;
import entities.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import services.AluguelServico;
import services.TaxaServicoBrasileira;

/**
 *
 * @author Evandro
 */
public class Application {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        System.out.println("Digite o modelo do carro...");
        String carroModelo = sc.nextLine();
        
        
        System.out.println("Digite a data e hora de entrada...");
        Date entrada = sdf.parse(sc.nextLine());
       
        System.out.println("Digite a data e hora de saida...");
        Date saida = sdf.parse(sc.nextLine());
         AluguelCarro aluguel = new AluguelCarro(entrada, saida,new Veiculo(carroModelo));
         
       
         
        System.out.println("Digite o preço po hora...R$ ");
        double valorHora = sc.nextDouble();
        
        System.out.println("Digite o preço po dia ...R$ ");
        double valorDia = sc.nextDouble();
         
        AluguelServico servico = new AluguelServico(valorHora, valorDia, new TaxaServicoBrasileira());
        
         servico.processInvoice(aluguel);
       
       

        System.out.println(" Sevicos "+ servico.toString());
        System.out.println(aluguel.toString());
      
    }
    
}
