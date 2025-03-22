package apps;
public class Telegram extends RedesSociais {

    @Override
    public void enviarMensagem() {
      validarConexaoInternet();
      System.out.println("Enviado pelo telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebido pelo telegram");
    }
   

}
