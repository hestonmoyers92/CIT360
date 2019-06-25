package Collections;


import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayList {
	public static void main(String args[]) {
	
	ArrayList<String> family = new ArrayList<String>();
	family.add("John");
	family.add("Pete");
	family.add("Ashley");
	family.add("Chris");
	family.add("Justin");
	family.add("Paul");
	family.add("Chad");
	family.add("Logan");
	     
	System.out.println("My family has : " +family+" in it");
	System.out.println("There are "+family.size()+" people my family.");
        
        Iterator<String> iterator = family.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            }
        }
        
        
}