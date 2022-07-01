package practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game \n\t Choose your options \n\t 1->ROCK \n\t 2->PAPER \n\t 3->SCISSOR");
        Scanner sc=new Scanner(System.in);
        int user=sc.nextInt();
        if(user ==1 || user==2 || user==3){
            Random rand=new Random();
            int computer=rand.nextInt(3)+1;//generating nos starting from 1 to 3;
            //Displaying Computer Choice
            if(computer==1){
                System.out.println("Computer Chooses ROCK");
            }
            else if(computer==2){
                System.out.println("Computer Chooses PAPER");
            }
            else if(computer==3){
                System.out.println("Computer Chooses SCISSOR");
            }
            else
                System.out.println("Code Fails");
            //Game Coding
            if(user==computer)
                System.out.println("Match Tied Bro");
            else if(user == 1 && computer == 3 || user==2 && computer==1 || user==3 && computer==2)
                System.out.println("WOW CONGRATS \n\t YOU WIN! ");
            else
                System.out.println("OopS! \n\t YOU LOOSE! ");
        }
        else
            System.out.println("WRONG OPTION CHOOSEN");
    }
}
