
package lecture;

//numerical casting in java is prerequisite to generic which is prerequisite to data structure

public class NumericalCasting {
    public static void main(String[] args) {
        byte bytes1 = 20;
        short short1 = 55;
        int intvalue = 999;
        long longvalue = 2893073;
        float floatvalue1 = 8433.74f;   // special case, must use f
        float floatvalue2 = (float) 8433.74; 
        double doublevalue = 2323.43530938;
        
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        
        intvalue = (int) longvalue;
        doublevalue = intvalue; //somthing related to dataype container
    }
}
