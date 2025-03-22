import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.RedesSociais;
import apps.Telegram;

public class Computer {
    public static void main(String[] args) throws Exception {
       
       RedesSociais smi = null; 
       String appEscolhido = "facebook";

       if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
       else if (appEscolhido.equals("telegram"))
            smi = new Telegram();
        else if (appEscolhido.equals("facebook"))
            smi = new FacebookMessenger(); 

        smi.enviarMensagem();
        smi.receberMensagem();
    }

    
}
