
package Collections;

import java.util.HashMap;

public class CollectionHashMap {
	public static void main(String args[]) {
		
		HashMap<String, String> phone = new HashMap<String, String>();
		phone.put("IphoneXS", "64 gb, 256 gb, 512 gb");
		 phone.put("IphoneXS Max", "64 gb, 256 gb, 512 gb");
		 
		 
		
		
		 System.out.println("There are "+ phone.size()+ " new iphones");
		 
		 System.out.println(phone);
		 
	}
} 


