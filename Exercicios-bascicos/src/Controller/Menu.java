package Controller;

import EstruturaDeControle.Imc;
import EstruturaDeControle.MultiplicationTable;
import EstruturaDeControle.OddOrEven;
import Exercices.Person;
import Exercices.Square;
import Exercices.Triangle;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);


    public void MenuController(){

        Boolean running = true;

        while (running){
            System.out.println("Press any button to start");
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Discovery your age");
            System.out.println("2 - Calcule a square area");
            System.out.println("3 - Calcule a Triangle area.");
            System.out.println("4 - Multiplication Table.");
            System.out.println("5 - IMC Calculator.");
            System.out.println("6 - Odd or even .");
            System.out.println("Choose one option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){ //menuOption
                case 1: //AGE
                    Person person = new Person();
                    person.setName();
                    person.setBirthYear();
                    person.CalculeAge();
                    break;
            }
            switch (choice){
                case 2: //sqr
                    Square square = new Square();
                    square.setSquareSide();
                    square.calculeteArea();
                    System.out.println(square.calculeteArea());
                    break;
            }
            switch (choice){
                case 3: //triangulo
                    Triangle triangle = new Triangle();
                    triangle.setBase();
                    triangle.setHeight();
                 System.out.println(triangle.CalculateArea());
                 break;
            }
            switch (choice){ //Multiplication
                case 4:
                    System.out.println("Enter a number");
                    int number = sc.nextInt();
                    MultiplicationTable mt = new MultiplicationTable();
                    mt.calcule(number);
                    break;
            }
            switch (choice){ //IMC
             case 5:
                  Imc imc = new Imc();
                  imc.ImcCalculate();
                  break;
            }
            switch (choice){ //ODD
                case 6:
                    OddOrEven od = new OddOrEven();
                    od.NumberValidation();
                    od.Run();
                    break;
            }
            switch (choice){ //sair
                case 7:
                    running = false;
                    System.out.println("Exiting...");
                    break;
            }

        }


    }
}


