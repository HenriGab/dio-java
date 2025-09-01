package Exercices;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;
    Scanner sc = new Scanner(System.in);

    public Person(){
    }

    public String getName() {

        return name;
    }

    public void setName() {
        System.out.println("enter your name");
        this.name = sc.nextLine();
        if( this.name ==null || this.name.trim().isEmpty()){
            throw new IllegalArgumentException("The name cant be empty");
        }
        if (this.name.matches(".*\\d.*")){
            throw new IllegalArgumentException("The name can't have numberes");
        }

        this.name = name;
    }

    public int getBirthYear() {

        return birthYear;
    }

    public void setBirthYear() {
        System.out.println("enter your birth year");
        this.birthYear = sc.nextInt();
        if(this.birthYear<1900||this.birthYear > Year.now().getValue()){
            throw new IllegalArgumentException("Invalid Year. Try again");
        }
        this.birthYear = birthYear;
    }

    public void CalculeAge(){
       int result = Year.now().getValue() - birthYear;
        System.out.println("Hello, " + this.name + " Your age are: "+result);
    }
}
