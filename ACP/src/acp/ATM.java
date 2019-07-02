/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import java.util.Scanner;

/**
 * 
 * @author PMPAdmin
 */
public class ATM {
    
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Controller bank = new Controller();
		double balance = (int)((Math.random() * 101) + 67);
		double amount;
		String request;
		//Simplified menu to reduce user input
		System.out.println("Please type your selection below.");
		System.out.println("To display your balance: B\n"
                                + "To withdraw funds: W\n"
                                + "To deposit funds: D\n"
                                + "To exit and retrieve your card: Q");
		
		request = input.nextLine();
                //case formatting to fit with switch:case below.
                request = request.toUpperCase();
		
		while (request != "Q") {
			
			switch(request) {
			
				case "B":
					balance = bank.handleRequest(request, balance, 0);
					break;
					
				case "W":
					System.out.println("Please enter the withdrawal amount:");
					amount = Integer.parseInt(input.nextLine());
                                        System.out.println("That is going to hurt....");
					balance = bank.handleRequest(request, balance, amount);
					break;
                                case "D":
                                        System.out.println("Please enter the amount of your deposit:");
                                        amount = Integer.parseInt(input.nextLine());
                                        System.out.println("We will see how long that lasts.");
                                        balance = bank.handleRequest(request, balance, amount);
				
				default: 
					System.out.println("That input does not correspond to a menu option.");
					break;			
			}
			
			System.out.println("To display your balance: B\n"
                                + "To withdraw funds: W\n"
                                + "To deposit funds: D\n"
                                + "To exit and retrieve your card: Q");;				
			request = input.nextLine();
		}
		
		System.out.println("Thank you for choosing JavaBank.");
	}
    
}
