package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
    private  static final Scanner sc = new Scanner(System.in);

    public static int readInt (String prompt){
        int value = -1;
        boolean valid = false;

        while (!valid){
            try {
                System.out.println(prompt);
                value = sc.nextInt();
                sc.nextLine();
                valid = true;
            }catch (InputMismatchException e ){
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
            }
        }

        return value;
    }

    public static String readline (String prompt){
        System.out.println(prompt);
        return sc.nextLine();
    }
}
