package entities;

public class Contador {
    public int number1;
    public int number2;


    public void calculateCounter(int n2, int n1) throws ParametrosInvalidosException{
        if(n1>n2){
            throw new ParametrosInvalidosException("The second number needs to be bigger than the first");
        }
        int count = n2-n1;
        for (int i = 1; i <=count;i++){
            System.out.println((i)+" Interecation");
        }
    }
}
