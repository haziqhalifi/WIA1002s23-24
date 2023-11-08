
package lecture;
import java.util.ArrayList;
//Generics
//Class Object - String, double, boolean etc

public class Generics {
    public static void main(String[] args) {
        //how arraylist was used before generics BEFORE JAVA 5 (2004)
        ArrayList list = new ArrayList();
        list.add("apple"); //index 0
        list.add("orange"); //index 1
        
        String fruit = (String) list.get(0); //downcasting from Object to String
        System.out.println(fruit);
        
        //AFTER JAVA 5
        ArrayList<String> str1 = new ArrayList<String>();  // to work with String
        ArrayList<Integer> num1 = new ArrayList<Integer>(); // to work with double
        
        str1.add("Lion"); // no need to casting anymore from Object to String
        str1.add("Panda");
        str1.add("Tiger");
        str1.add("Crocodile");
        System.out.println(str1.get(1));
        
        num1.add(20); 
    }
}
