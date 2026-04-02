package LearnTheBasics.ThingsToKnowInJAVA;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You can vote this year");
                break;
            case 12:
                System.out.println("You are not able to vote this year");
                break;
            default:
                System.out.println("I am a default case");
                break;
        }
    }
}
