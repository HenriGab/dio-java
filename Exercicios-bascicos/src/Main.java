import Controller.Menu;
import EstruturaDeControle.OddOrEven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.MenuController(); //Executa um menu aonde você escolhe a função que deseja

        sc.close();
    }

}
