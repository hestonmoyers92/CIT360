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
public class Withdraw implements BankingInterface{
    
    public double bank(double balance, double amount) {
		System.out.println("You have withdrawn $" + amount + ".");
                System.out.println("Don't spend it all in one place.");
		return balance-amount;
	}
    
}
