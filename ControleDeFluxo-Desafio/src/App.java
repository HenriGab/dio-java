import java.util.Locale;
import java.util.Scanner;

import entities.Contador;
import entities.ParametrosInvalidosException;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        boolean validInput = false;
        Scanner sc = new Scanner(System.in);
        Contador contador = new Contador();
        int number1 =0; int number2 =0;
        

        while (!validInput) {
            try{
                System.out.println("Enter the first number");

                number1 = sc.nextInt();
                System.out.println("Enter the second number");
                 number2 = sc.nextInt();
                contador.calculateCounter(number2, number1);
                validInput = true;
            }catch(NumberFormatException e){
                System.out.println("Error: Only integers!");
            } 
            catch(ParametrosInvalidosException exception){
                System.out.println("The second number needs to be bigger than the first");
                
            };
        }
        sc.close();
     }  
}
       
        
        
    