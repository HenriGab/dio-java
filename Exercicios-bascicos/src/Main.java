import Exercices.Menu;
import Exercices.Person;
import Exercices.Square;
import Exercices.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean running = true;

        while (running){
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Discovery your age");
            System.out.println("2 - Calcule a square area");
            System.out.println("3 - Calcule a Triangle area.");
            System.out.println("4 - Sair.");
            System.out.print("Escolha uma opção: ");

            int choice = sc.nextInt();
            sc.nextLine();

            Menu menuOption;
            switch (choice){
                case 1:
                    menuOption = Menu.CALCULE_AGE;
                    break;
                case 2:
                    menuOption = Menu.CALCULE_SQUAR;
                    break;
                case 3:
                    menuOption = Menu.CALCULE_TRIANGLE;
                    break;
                case 4:
                    menuOption = Menu.SAIR;
                    break;
                default:
                    System.out.println("Invalid option");
                    continue;
            }
            switch (menuOption){
                case CALCULE_AGE:
                   Person person = new Person();
                    person.setName();
                    person.setBirthYear();
                    person.CalculeAge();
                   break;
            }
            switch (menuOption){
                case CALCULE_SQUAR:
                    Square square = new Square();
                    square.setSquareSide();
                    square.calculeteArea();
                    System.out.println(square.calculeteArea());
                    break;
        }
            switch (menuOption){
                case CALCULE_TRIANGLE:
                    Triangle triangle = new Triangle();
                    triangle.setBase();
                    triangle.setHeight();
                    System.out.println(triangle.CalculateArea());
                    break;
            }
            switch (menuOption){
                case SAIR:
                    running = false;
                    System.out.println("Exiting...");
                    break;
            }

    }
        sc.close();
    }
}