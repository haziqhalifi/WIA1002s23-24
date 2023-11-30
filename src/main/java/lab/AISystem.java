/* Question 6
 * week7
 * Author: Haziq Halifi;
 */
package lab;

import java.util.ArrayList;

class Vehicle {
    
    String type;
    int num;
    int priority;
    
    Vehicle(String type, int num, int priority) {
        this.type = type;
        this.num = num;
        this.priority = priority;
    }
    
    public String toString() {
        return type + "\t" + num + " (Priority=" + priority + ")";
    }
}

public class AISystem {
    
    MyQueue1<Vehicle> roadQ = new MyQueue1<>();
    ArrayList<Vehicle> prior2 = new ArrayList<>();
    ArrayList<Vehicle> prior1 = new ArrayList<>();
    ArrayList<Vehicle> prior0 = new ArrayList<>();
    
    public static void main(String[] args) {
        AISystem road1 = new AISystem();
        road1.store("Car", 1, 1);
        road1.store("Truck", 2, 2);
        road1.store("Motorcycle", 3, 0);
        road1.store("Motorcycle", 4, 0);
        road1.store("Truck", 5, 2);
        road1.store("Car", 6, 1);
        road1.store("Truck", 7, 2);
        road1.store("Truck", 8, 2);
        road1.store("Motorcycle", 9, 0);
        road1.store("Car", 10, 1);
        road1.display();
        System.out.println("");
        road1.precedence();
        road1.displaySort();
    }
    
    public void store(String type, int num, int priority) {
        roadQ.enqueue(new Vehicle(type, num, priority));
    }
    
    public void display() {
        roadQ.display();
        
    }
    
    public void precedence() {
        
        for (int i = 0; i < 10; i++) {
            int prior = roadQ.peek().priority;
            if (prior == 2) {
                prior2.add(roadQ.dequeue());
            } else if (prior == 1) {
                prior1.add(roadQ.dequeue());
            } else {
                prior0.add(roadQ.dequeue());
            }
        }
    }
    
    public void displaySort() {
        sort(prior2);
        sort(prior1);
        sort(prior0);
    }

    public void sort(ArrayList<Vehicle> v) {
        for (int i = 0; i < v.size() - 1; i++) {
            for (int j = 0; j < v.size() - i - 1; j++) {
                Vehicle temp = prior2.get(j+1);
                prior2.set(j+1, prior2.get(j));
                prior2.set(j, temp);
            }            
        }
        
        for (Vehicle vc : v){
            System.out.println(vc);
        }
    }
    
}
