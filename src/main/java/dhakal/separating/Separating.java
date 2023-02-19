/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.separating;

/**
 *
 * @author tikad
 */
import java.util.Scanner;
import java.util.Random ;
public class Separating {
    public static void main(String [] args){
        
        Scanner sc= new Scanner (System.in);
        Random rand = new Random();
        System.out.println("**WELCOME**");
       
        
        int guessNum = rand.nextInt (1000-1)+1;
        System.out.println("The Random computer generated number is " +guessNum + "\n");
        
        
        int userGuess;
        int countGuess =0;
        while (true){
            System.out.println("Guess the number between 1 and  1000:");
            userGuess = sc.nextInt ();
            
            if (userGuess > guessNum){
                
                System.out.println("Too High, try again!!\n");
            
            }
         
            else if (userGuess <guessNum){
                
                System.out.println("Too low, try again!!\n");
                
            }
            
            else{
                System.out.println("Congratulation you guessed the number with "+ "guesses!!");
                break;
            }
            countGuess++;
        }
    String choice;
    System.out.print ("\nDo you want to play again (Y/N):");
    
    choice = sc.next();
    if (choice.equals("n")|| choice.equals("N")){
        
        System.out.println("\nGoodbye!!");
        
    }
    
    
    
    }
        
        
    }

   

    
  