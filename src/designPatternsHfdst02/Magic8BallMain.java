package designPatternsHfdst02;

import java.util.Scanner;

public class Magic8BallMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef je vraag in, tijp stop om te stoppen.");
        String vraag = sc.nextLine();
        while (!vraag.equalsIgnoreCase("stop")){
            System.out.println(Magic8Ball.INSTANCE.antwoord());
            System.out.println("Geef je vraag in, tijp stop om te stoppen.");
            vraag = sc.nextLine();            
        }        
    }    
}
