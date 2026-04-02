package LearnTheBasics.ThingsToKnowInJAVA;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Age to Confirm the elegible for vote or not ");
        int age = sc.nextInt();

        if (age > 18 && age <=45){
            System.out.println("eligible to vote");
        } else if (age > 45) {
            System.out.println("You are old");
        } else if (age < 5) {
            System.out.println("Bohot Chota hai re tu ");
        } else{
            System.out.println("Arre Bachha haii tu mera");
        }

    }
}
