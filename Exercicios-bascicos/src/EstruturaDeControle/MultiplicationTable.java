package EstruturaDeControle;

import java.util.Scanner;

public class MultiplicationTable {
    Scanner sc = new Scanner(System.in);
    public void calcule(int number){
        System.out.println("The multiplication table of "+ number + " is: ");
        for(int i =0 ; i <=10; i++){
            System.out.println(number +" x " + i + " is: "+ number*i);
        }
    }


}
