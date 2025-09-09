package EstruturaDeControle;

import java.util.Scanner;

public class Imc {
    Scanner sc = new Scanner(System.in);


    public void ImcCalculate(){
        System.out.println("Enter your height in meters");
        float height = sc.nextFloat();
        System.out.println("Enter your weight in KiloGrams ");
        float weight = sc.nextFloat();
        float imcFormula = weight/(height*height);

        System.out.println("Your IMC is: "+ imcFormula);


    }
}
