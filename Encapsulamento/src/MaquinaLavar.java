public class MaquinaLavar{
    double water = 10;
    double shampoo = 2;
    String petStatus = "";

    public void darBanho(int x){
        colocarPetBanho(x);
    }

    public void abastecerAgua(double water){
        boolean validar = verificarAgua(water);
        while(validar){
            water = water+2;
            System.out.println("Abastecendo agua");
            validar =verificarAgua(water);
        }
        if (validar==false){
            if (water>30){
                System.out.println("Agua: cheio");
                water = 30;
            }
        }

    }

    public void abastecerShampoo(double shampoo){
        boolean validar = verificarShampoo(shampoo);
        while(validar){
            shampoo = shampoo+2;
            System.out.println("Abastecendo shampoo");
            validar =verificarAgua(shampoo);
        }
        if (validar==false){
            if (shampoo>10){
                System.out.println("shampoo: cheio");
                water = 10;
            }
        }

    }

    public boolean verificarAgua(double water) {
        if (water < 10) {
            System.out.println("pouca agua, precisa abastecer");
            return true;
        }
        else {
            System.out.println("possui agua");
            return false;
        }
    }
    public boolean verificarShampoo(double shampoo) {
        if (shampoo < 2) {
            System.out.println("pouco shampoo, precisa abastecer");
            return true;
        }
        else {
            System.out.println("possui shampoo");
            return false;
        }
    }
    public boolean petNoBanho(int adicionarPet){

        if (adicionarPet ==1 ){
            System.out.println("Ja possui um pet tomando banho");
            return true;
        }
        else {
            System.out.println("Nao possui pet");
            return false;
        }
    }
    public void colocarPetBanho(int x){
        if (petNoBanho(x)==true)
            return;
        abastecerAgua(this.water);
        abastecerShampoo(this.shampoo);
        System.out.println("Tomando banho");
        limparMaquina();
    }
    public boolean tirarPetBanho(String petStatus){
        if (petStatus.equals("limpo")){
            System.out.println("Pet limpo");
            return false;
        }else {
            System.out.println("pet sujo, necessario limpar a maquina");
            return true;
        }
    }

    public void limparMaquina(){
        boolean validar = tirarPetBanho(this.petStatus);
        if (validar){
            this.water = this.water-3;
            this.shampoo = this.shampoo-1;
        }
    }
}