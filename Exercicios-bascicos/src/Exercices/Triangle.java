package Exercices;

import java.util.Scanner;

public class Triangle {
    private float height;
    private float baseLenght;
    Scanner sc = new Scanner(System.in);

    public Triangle() {
    }

    public float getBase() {
        return baseLenght;
    }

    public void setBase() {
        while (true) {
            System.out.println("Enter the base lenght");
            try {
                float input = sc.nextFloat();
                if (input > 0) {
                    this.baseLenght = input;
                    break;
                }
                else {
                    System.out.println("Error: The value need to be bigger than zero");
                }
            } catch (Exception e) {
                System.out.println("Error: Please, enter a valid number");
                sc.next();
            }
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight() {
        while (true) {
            System.out.println("Enter the height");
            try {
                float input = sc.nextFloat();
                if (input > 0) {
                    this.height = input;
                    break;
                }else{
                    System.out.println("The value needs to be bigger than zero");
                }
            }catch (Exception e){
                System.out.println("Error: Please, enter a valid number");
                sc.next();
            }
        }

    }
    public double CalculateArea(){
        return (baseLenght * height)/2.0;
    }
}



