/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

/**
 * 
 * @author PMPAdmin
 */
public class Balance implements BankingInterface {
    
    public double bank(double balance, double amount) {
        
		System.out.println("Your balance is $" + balance + ".");
                System.out.println("Lower than you thought?  I know the feeling!");
		return balance;
	}	
    
}
