package lists.with.generics;

import common.Dog;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Ben Holewinski
 */
public class ListNotesSampleDemo {
    public static void main(String[] args) {
        //Create the list variable and instantiate the object
        //Always use List because of Liskoff Substitution Principle
        //With List, you can use ArrayList() or Vector()
        //Generic List. A list is made generic by adding <String>, don't need to cast (String) an object
        List<String> myList = new ArrayList<String>();
        //When using Vector instead of ArrayList, you can set a default size
        //For example, Vector<String>(5) will be a Vector of Strings with 5 slots
        //If left blank, it will have a default of 10 slots and once it reaches
        //10 slots, it will continue to double as the slots are used up.
        //If you use Vector<String>(5,5); you will have a Vector with 5 slots that
        //will increment in multiples of 5 every time (5, 10, 15, 20)
        //With ArrayList, you can only set the initial capacity... 
        //ArrayList<String>(5) will be an ArrayList that can hold 5 strings.
        
        myList.add("Beer Chips"); // 0
        myList.add("Chicken"); // 1
        myList.add("Pizza"); // 2
        myList.add("Sprecher's Orange Dream"); // 3
        //myList.add(new Dog()); //Can no longer have dog because it is a list of Strings
        
        //You can remove by index or by the Object
        myList.remove(1);
        myList.remove("Pizza");
        //Using add and an index (1 in example below) it shifts everything down.
        myList.add(1,"Marshmallow");
        // .set Overwrites the list item
        myList.set(2, "Sprecher's Rootbeer");
        
        for(String s : myList) {
            s = s.toUpperCase();
            System.out.println(s);
        }
        
        //String pizza = (String)myList.get(2);
        
//        for(Object obj : myList) {
//            String s = null;
//            Dog d = null;
//            if(obj instanceof String) {
//                s = (String)obj;
//                s = s.toUpperCase();
//                System.out.println(s);
//            } else if(obj instanceof Dog) {
//                d = (Dog)obj;
//                System.out.println("YOU GOT A DOG!");
//            }
//        }
    }
}
