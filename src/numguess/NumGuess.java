/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numguess;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author stuti
 */
public class NumGuess 
{

   
    public static void main(String[] args) 
    {
        

    int guess = 0;
    int attempt = 1;
    Random i = new Random();
    int number = i.nextInt(10);
    Scanner input = new Scanner(System.in);
    System.out.print("I am thinking of a number...can you guess it!!!\n");
    
    while(guess != number)
    {
        System.out.printf("Attempt %d : Guess the number(1 to 10) :  \n",attempt);
        guess = input.nextInt();
        attempt++;
    }
    System.out.printf("Great...You guessed it in %d attempts....it was %d!!!\n",attempt-1,number);
        
    }
   
}

    
    

