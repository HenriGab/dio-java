import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Account Number: ");
        int numero = sc.nextInt();
        
        System.out.printf("\nAgency Number: ");
        sc.nextLine();
        String angencia = sc.nextLine();

        System.out.printf("\nClient name: ");
        String nomeDoCliente = sc.nextLine();

        System.out.printf("\n Balance: ");
        double saldo = sc.nextDouble();

        ContaTerminal(numero, angencia, nomeDoCliente, saldo);

    }

    public static void ContaTerminal(int numero, String agencia, String nomeDoCliente, double saldo){

            System.out.println("Ola, "+nomeDoCliente+", Obrigado por criar uma conta em nosso banco, sua agência é "
            +agencia+", conta "+numero+" e o saldo de "+ saldo+" já está disponivel para saque");
    }
}
