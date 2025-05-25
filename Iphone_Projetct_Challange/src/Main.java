
import Menus.*;
import model.Iphone;
import util.InputUtils;
import util.Formatter;

public class Main{

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        boolean running = true;

        while (running) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            for (MainMenu option : MainMenu.values()) {
                System.out.println(option.getCode() + " - " + Formatter.formatEnumName(option));
            }

            int choice = InputUtils.readInt("Escolha uma opção: ");
            MainMenu selected = MainMenu.fromCode(choice);

            if (selected == null) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (selected) {
                case MUSIC -> handleMusicMenu(iphone);
                case PHONE -> handlePhoneMenu(iphone);
                case BROWSER -> handleBrowserMenu(iphone);
                case EXIT -> running = false;
            }
        }

        System.out.println("Encerrando o iPhone...");
    }

    private static void handleMusicMenu(Iphone iphone) {
        boolean back = false;

        while (!back) {
            System.out.println("\n--- MENU MÚSICA ---");
            for (MusicMenu option : MusicMenu.values()) {
                System.out.println(option.getCode() + " - " + Formatter.formatEnumName(option));
            }

            int choice = InputUtils.readInt("Escolha uma opção: ");
            MusicMenu selected = MusicMenu.fromCode(choice);

            if (selected == null) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (selected) {
                case CHOOSE_MUSIC -> {
                    String music = InputUtils.readline("Digite o nome da música: ");
                    iphone.SelectMusic(music);
                }
                case PLAY -> iphone.play();
                case PAUSE -> iphone.pause();
                case EXIT -> back = true;
            }
        }
    }

    private static void handlePhoneMenu(Iphone iphone) {
        boolean back = false;

        while (!back) {
            System.out.println("\n--- MENU TELEFONE ---");
            for (PhoneMenu option : PhoneMenu.values()) {
                System.out.println(option.getCode() + " - " + Formatter.formatEnumName(option));
            }

            int choice = InputUtils.readInt("Escolha uma opção: ");
            PhoneMenu selected = PhoneMenu.fromCode(choice);

            if (selected == null) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (selected) {
                case CALL -> {
                    String number = InputUtils.readline("Digite o número para ligar: ");
                    iphone.call(number);
                }
                case ANSWER -> iphone.answer();
                case VOICEMAIL -> iphone.startVoiceMail();
                case EXIT -> back = true;
            }
        }
    }

    private static void handleBrowserMenu(Iphone iphone) {
        boolean back = false;

        while (!back) {
            System.out.println("\n--- MENU NAVEGADOR ---");
            for (BrowserMenu option : BrowserMenu.values()) {
                System.out.println(option.getCode() + " - " + Formatter.formatEnumName(option));
            }

            int choice = InputUtils.readInt("Escolha uma opção: ");
            BrowserMenu selected = BrowserMenu.fromCode(choice);

            if (selected == null) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (selected) {
                case SHOW_PAGE -> {
                    String url = InputUtils.readline("Digite a URL da página: ");
                    iphone.showPage(url);
                }
                case NEW_TAB -> iphone.addNewPage();
                case REFRESH -> iphone.updatePage();
                case EXIT -> back = true;
            }
        }
    }
}
