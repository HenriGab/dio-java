import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=1;
        int x =1;
        MaquinaLavar mq = new MaquinaLavar();

        do {
            System.out.println("1-ADD PET");
            input = sc.nextInt();
            mq.darBanho(input);

        }while (input ==0);

    }
}