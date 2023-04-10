package Example.Exercises;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){

        Scanner Value  = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = Value.nextInt();

        if(age>=0 && age<=2){
            System.out.println("You are a baby.");
        }

        else if (age>=3 && age<=12){
            System.out.println("You are a child.");
        }

        else if (age>=13 && age<=17){
            System.out.println("You are a teenager.");
        }

        else if (age>=18 && age<=65){
            System.out.println("You are an adult.");
        }

        else if (age>=66 && age<=110){
            System.out.println("You are an adult.");
        }

        else{
            System.out.println("Realy?!?!?!?!?!?!?!?!?!?");
        }

    }
}