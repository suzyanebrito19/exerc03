package application;
import java.text.ParseException;  
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Programa {

	public static void main(String[] args)throws ParseException {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.println("Insira os dados do contrato");
	System.out.print("Número: ");
	int numero = sc.nextInt();
	System.out.print("Data (dd/MM/yyyy): ");
	Date date = sdf.parse(sc.next());
	System.out.print("Valor do contrado: ");
	double totalValor = sc.nextDouble();
	
	Contract contrato = new Contract(numero, date, totalValor);
	
	System.out.print("Insira o número de parcelas:");
	int n = sc.nextInt();
	
	ContractService contractService = new ContractService(new PaypalService());
	
	contractService.processContract(contrato, n);
	
	System.out.println("Parcelas:");
	for (Installment x : contrato.getInstallments()) {
		System.out.println(x);
	}
			
	sc.close();
	}
}

