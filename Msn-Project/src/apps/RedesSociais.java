package apps;
public abstract class RedesSociais {
   
   public abstract void enviarMensagem();
   public abstract void receberMensagem();

   protected void validarConexaoInternet(){
    System.out.println("Validando");
   }
}
