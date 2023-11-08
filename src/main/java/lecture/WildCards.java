package lecture;

import java.util.ArrayList;

class Machine {
    public Machine(){
        System.out.println("Haziq");
    }
    
}

class Camera extends Machine {

}

public class WildCards {

    public static void showList(ArrayList<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }
 
    public static void showList2(ArrayList<Machine> list) {
        for (Machine value : list) {  //wildcard here
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hari");
        list.add("ini");
        list.add("Hari");
        list.add("Selasa");
        showList(list);

        ArrayList<Machine> list2 = new ArrayList<Machine>();
        list2.add(new Machine());
        showList2(list2);
    }

}
