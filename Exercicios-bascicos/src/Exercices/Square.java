package Exercices;

import java.util.Scanner;

public class Square {
    private double squareSide;
    Scanner sc = new Scanner(System.in);

    public Square (){
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide() {
        while (true) {
            System.out.println("Type the size of the square side");
            try {
                float input = sc.nextFloat();
                if (input > 0) {
                    this.squareSide = input;
                    break;
                } else {
                    System.out.println("The value need to be bigger than zero");
                }
            } catch (Exception e) {
                System.out.println("Error, please enter a valida number");

            }
        }
    }

    public double calculeteArea(){
        return this.squareSide*this.squareSide;
    }
}
