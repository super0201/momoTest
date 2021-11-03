/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package momotest2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author super
 */
public class MomoTest2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // Momo talents show 2021
        // After learning '100 bài code thiếu nhi', I've decided to apply for
        // the Java trainee position at one of the largest fintech company - Momo.
        
        Scanner scanner = new Scanner(System.in);
        int pops, note, total, buy, coke, pepsi, soda;
        boolean rs = false;
        soda = 20000;
        coke = pepsi = 10000;
       
        
        System.out.println(" ____________________________________________");
        System.out.println("|    Welcome to Momo Pops Vending Machine    |");
        System.out.println("|               - - - - - - -                |");
        System.out.println("|                                            |");
        System.out.println("|   Please select the drink you want to buy  |");
        System.out.println("|             1. Coke (10.000đ)              |");
        System.out.println("|             2. Pepsi (10.000đ)             |");
        System.out.println("|             3. Soda  (20.000đ)             |");  
        System.out.println("|____________________________________________|");
       
        //Get user input
        
        System.out.print("Select the order number you want to buy: ");
        pops = scanner.nextInt();        
        
        //Check input value if it exceed total order number
        
        while(pops > 3) {
            System.out.print("Select again: ");
            int pops1 = scanner.nextInt();
            pops = pops1;
        }
        
        //10% chance of getting a free pop
        
        Random r = new Random();
        
        float chance = r.nextFloat();

        if (chance <= 0.10f){
            rs = true;
        }
        
        // This is where the magic happens!
        // Where I turned Coin-operated vending machine to bank note-operated
        // vending machine ~~ Magic ~~
        
        switch(pops) {
            //divide case 
            case 1 -> {
                System.out.println("You have selected Coke!");
                System.out.print("Amount of Coke you want to buy: ");
                buy = scanner.nextInt();
                
                System.out.println("You are buying " + buy + " Coke");
                System.out.println(" ____________________________________________");
                System.out.println("|          Please insert your money          |");
                System.out.println("|               - - - - - - -                |");
                System.out.println("|           Amount needed: " + coke * buy + "            |");
                System.out.println("|                                            |");
                System.out.println("|    We only accept these following notes    |");
                System.out.println("|         10.000đ            50.000đ         |");
                System.out.println("|         20.000đ           100.000đ         |");  
                System.out.println("|                 200.000đ                   |");  
                System.out.println("|____________________________________________|");
                
                note = scanner.nextInt();
                
                //validate input if the amount of money or not-accepted bank note put in
                while (note < coke* buy) {
                    
                    while (note != 10000 && note != 20000 && note != 50000 && note != 100000 && note != 200000 || note > 200000) {                    
                        System.out.println("Insert right note as given above: ");
                        int note1 = scanner.nextInt();
                        note = note1;

                    }
                    
                    int rest = coke * buy - note;
                    System.out.println("You are " + rest + " short, please insert more!");
                    int inp = scanner.nextInt();
                    note = note + inp;
                }

               
                System.out.println("Amount: " + note + "đ");
                System.out.println("Do you want to proceed to purchasing?");
                System.out.println("1. Yes                     2. No");
                int answ = scanner.nextInt();
                
                total = note - coke * buy;
                
                if (answ == 2){
                    System.out.println("Please receive money back");
                    System.out.println("Amount: " + note + "đ");
                    System.out.println("Thank you!");
                } else if(rs == true && buy >= 3){ 
                    System.out.println("Please receive your change: " + total + "đ");
                    System.out.println("You just won a free Coke!");
                    System.out.println("Your total Coke is: " + (buy + 1));
                    System.out.println("Thanks for your purchasing at Momo vending machine!");
                } else {
                    System.out.println("Please receive your change: " + total + "đ");
                    System.out.println("Thanks for your purchasing at Momo vending machine!");
                }
               
                break;
                
            }
            
            case 2 -> {
                System.out.println("You have selected Pepsi!");
                System.out.print("Amount of Pepsi you want to buy: ");
                buy = scanner.nextInt();
                
                System.out.println(" ____________________________________________");
                System.out.println("|          Please insert your money          |");
                System.out.println("|               - - - - - - -                |");
                System.out.println("|           Amount needed: " + pepsi * buy + "            |");
                System.out.println("|                                            |");
                System.out.println("|    We only accept these following notes    |");
                System.out.println("|         10.000đ            50.000đ         |");
                System.out.println("|         20.000đ           100.000đ         |");  
                System.out.println("|                 200.000đ                   |");  
                System.out.println("|____________________________________________|");
                
                note = scanner.nextInt();
                
                while (note < pepsi * buy) {
                    
                    while (note != 10000 && note != 20000 && note != 50000 && note != 100000 && note != 200000 || note > 200000) {                    
                        System.out.println("Insert right note as given above: ");
                        int note1 = scanner.nextInt();
                        note = note1;

                    }
                    
                    int rest = pepsi * buy - note;
                    System.out.println("You are " + rest + " short, please insert more!");
                    int inp = scanner.nextInt();
                    note = note + inp;
                }
                
                total = note - pepsi * buy;
                
                System.out.println("Amount: " + note + "đ");
                System.out.println("Do you want to proceed to purchasing?");
                System.out.println("1. Yes                     2. No");
                int answ = scanner.nextInt();
                
                if (answ == 2){
                    System.out.println("Please receive money back");
                    System.out.println("Amount: " + note + "đ");
                    System.out.println("Thank you!");
                } else if(rs == true && buy >= 3){ 
                    System.out.println("Please receive your change: " + total + "đ");
                    System.out.println("You just won a free Coke!");
                    System.out.println("Your total Coke is: " + (buy + 1));
                    System.out.println("Thanks for your purchasing at Momo vending machine!");
                } else {
                    System.out.println("Please receive your change: " + total + "đ");
                    System.out.println("Thanks for your purchasing at Momo vending machine!");
                }
                
                break;
            }
            
            case 3 -> {
                System.out.println("You have selected Soda!");
                System.out.print("Amount of Soda you want to buy: ");
                buy = scanner.nextInt();
                
                System.out.println(" ____________________________________________");
                System.out.println("|          Please insert your money          |");
                System.out.println("|               - - - - - - -                |");
                System.out.println("|           Amount needed: " + soda * buy + "đ           |");
                System.out.println("|                                            |");
                System.out.println("|    We only accept these following notes    |");
                System.out.println("|         10.000đ            50.000đ         |");
                System.out.println("|         20.000đ           100.000đ         |");  
                System.out.println("|                 200.000đ                   |");  
                System.out.println("|____________________________________________|");
                
                note = scanner.nextInt();
                
                while (note < soda * buy) {
                    
                    while (note != 10000 && note != 20000 && note != 50000 && note != 100000 && note != 200000 || note > 200000) {                    
                        System.out.println("Insert right note as given above: ");
                        int note1 = scanner.nextInt();
                        note = note1;

                    }
                    
                    int rest = soda * buy - note;
                    System.out.println("You are " + rest + " short, please insert more!");
                    int inp = scanner.nextInt();
                    note = note + inp;
                }

                System.out.println("Amount: " + note + "đ");
                System.out.println("Do you want to proceed to purchasing?");
                System.out.println("1. Yes                     2. No");
                int answ = scanner.nextInt();
                
                total = note - soda * buy;
               
                if (answ == 2){
                    System.out.println("Please receive money back");
                    System.out.println("Amount: " + note + "đ");
                    System.out.println("Thank you!");
                } else if(rs == true && buy >= 3){ 
                    System.out.println("Please receive your change: " + total + "đ");
                    System.out.println("You just won a free Coke!");
                    System.out.println("Your total Coke is: " + (buy + 1));
                    System.out.println("Thanks for your purchasing at Momo vending machine!");
                } else {
                    System.out.println("Please receive your change: " + total + "đ");
                    System.out.println("Thanks for your purchasing at Momo vending machine!");
                }
                
                break;
            }
        }  
    }
}

