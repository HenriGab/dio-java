package candidatura;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","GUSTAVO","AUGUSTO","MONICA","FABRICIO",
        "MIRELA","DANIELA","JORGE"};

        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

        
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando =true;
        boolean atendeu=false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");
        }while(continuarTentando && tentativasRealizadas <3);

        if (atendeu)
        System.out.println("Conseguimos contato com "+candidato+ " na " +tentativasRealizadas+"° tentativa");
        else
            System.out.println("Não Conseguimos contato com "+candidato+ " numero maximo de tentativas");
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;

    }
    static void selacaoCandidatos(){

        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","GUSTAVO","AUGUSTO","MONICA","FABRICIO",
        "MIRELA","DANIELA","JORGE"};

        int candidatoSeleciondos = 0;
        int candidatoAtual=0;
        double salarioBase = 2000;
        while (candidatoSeleciondos <5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+ 
            " Solicitou esse valor de salario " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                candidatoSeleciondos++;
            }
            candidatoAtual++;
        }
    }
    


    static void imprimirSelecionado(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","GUSTAVO","AUGUSTO","MONICA","FABRICIO",
        "MIRELA","DANIELA","JORGE"};

        for (int i=0; i< candidatos.length;i++){
            System.out.println("O candidato de n°"+(i+1)+" é o/a " + candidatos[i]);    
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido ){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if (salarioBase==salarioPretendido){
            System.out.println("Aguardando demais candidatos");
        }
        else{
            System.out.println("Ligar para o candidato com contraproposta");
        }
    }
}
