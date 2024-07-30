import com.sun.source.tree.NewArrayTree;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.println("Número do contrato");
        Integer numContrato = sc.nextInt();

        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);

        System.out.println("Valor do contrato: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(numContrato, date, totalValue);

        System.out.println("Entre com o número de parcelas: ");
        Integer nParcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, nParcelas);
        System.out.println("Parcelas: ");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
