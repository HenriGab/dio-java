package apps;
public class MSNMessenger extends RedesSociais{

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
       System.out.println("Enviado pelo msn");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebido pelo msn");
    }
    
}
