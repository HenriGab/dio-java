import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobrenome = sc.nextLine();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();




        System.out.printf("Olá, me chamo %s %s, tenho %d anos, minha altura é %.2f cm",nome,sobrenome,idade, altura);
        }
        catch(InputMismatchException e ){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
