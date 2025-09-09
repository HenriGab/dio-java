package EstruturaDeControle;

import Controller.Utilidades;
import jdk.jshell.execution.Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    private int firstNumber;
    private int secondNumber;
    Scanner sc = new Scanner(System.in);
    Utilidades util = new Utilidades();

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void NumberValidation() {
        while (true) {
            System.out.println("enter a number ");
            try{
                int number1 = sc.nextInt();
                sc.nextLine();
                System.out.println("enter a number bigger than the first one");
                int number2 = sc.nextInt();
                if (number2 > number1) {
                    this.firstNumber = number1;
                    this.secondNumber = number2;
                    break;

                } else {
                    System.out.println("the second number needs to be bigger than the first one");
                    util.clear();
                }
            }catch (Exception e){
                System.out.println("Need to be a integer number.");
                sc.next();
                util.clear();
            }


        }

    }

    public void Run (){
        int choose;
        while (true) {
            try {
                System.out.println("Choose one 1 - Odd or 2 - Even?");
                choose = sc.nextInt();
                if (choose == 1 || choose == 2) {

                    break;
                } else {
                    System.out.println("The option need to be 1 - Odd or 2 - Even");
                    util.clear();
                }
                //switch


            } catch (Exception e) {
                System.out.println("the option need to be a integer number");
                sc.next();
                util.clear();
            }
        }

        switch (choose){
            case 1:
                System.out.println("The odd numbers are: ");
                for(int i = firstNumber; i <= secondNumber; i++){
                    if(i%2 != 0){
                        System.out.printf(i+", ");
                    }
                }
                break;
            case 2:
                System.out.println("The Even numbers are: ");
                for(int i = firstNumber; i <= secondNumber; i++){
                    if(i%2 == 0){
                        System.out.printf(i+", ");
                    }
                }
                break;
        }


    }
}
