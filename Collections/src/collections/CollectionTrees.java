package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CollectionTrees {
    public static void main(String[] args){
        Set<String> family = new HashSet<>();
     
        family.add("Jesse");
        family.add("Logan");
        family.add("Ray");
        family.add("Kelli");
        family.add("Megan");
        family.add("Heston");
              
     	
        System.out.println(family);
        Set<String> treeSet = new TreeSet<>(family);
        System.out.println(treeSet);
    }   
}