package apps;
public class FacebookMessenger extends RedesSociais{

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviado pelo facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebido pelo facebook");
  
    }
}