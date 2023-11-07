
package Tutorial1;


public class Telephone {
    int areaCode;
    int number;
    static int numberOfTelephone;

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public static void main(String[] args) {
        Telephone number1 = new Telephone();
        number1.setAreaCode(03);
        number1.setNumber(79676300);
        System.out.println(makeFullNumber());
    }
    
    static String makeFullNumber(){
        //return areaCode+"-"+number;
        return("k");
    }
    
}
    
