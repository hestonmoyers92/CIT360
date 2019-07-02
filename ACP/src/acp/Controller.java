/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import java.util.HashMap;

/**
 * 
 * @author PMPAdmin
 */
public class Controller {
    
    public static HashMap<String, BankingInterface> map = new HashMap <String, BankingInterface>();
	
	public void Controller() {
		
	}
	
	public double handleRequest(String request, double balance, double amount) {
		
		map.put("W", new Withdraw()); 
		map.put("D", new Deposit());
		map.put("B", new Balance());
		
		BankingInterface handler = map.get(request);
		balance = handler.bank(balance, amount);
		
		return balance;
		
	}
    
}
