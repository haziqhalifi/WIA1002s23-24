/* 
 * week7
 * Author: Haziq Halifi;
 */

// Basic Queue

package lecture;

class Queue{
    // several data for class queue
    // the two pointer
    private int head;
    private int tail;
    // since you are working with an array, need array size
    private int maxSize;
    // declare an array
    private String[] arr;
    
    // use constructor to initialize all variables
    public Queue(int size){
        this.head = 0;
        this.tail = 0;
        this.maxSize = size;
        this.arr = new String[maxSize];
    }
    
    // check if the queue is empty
    public boolean isEmpty(){
        return tail == 0;
    }
    
    // check if the queue is full
    public boolean isFull(){
        return tail >= maxSize;
    }
    
    public void enqueue(String value){
        //FIFO rule! means enqueue at tail, dequeue at head
        if(isFull()){
            System.out.println("The queue is already full.");
        }
        else{
            arr[tail] = value;
            tail++;
            System.out.println("Enqueue: "+value);
        }
    }
    
    public void enqueueMany(String multipleStr){
        String[] temp = multipleStr.split(":");
        for(String s : temp){
            enqueue(s);
        }
    }
    
    public String dequeue(){
        if(isEmpty()){
            return "The queue is already empty.";
        }
        else{
            String temp = arr[head];
            for (int i = 0; i < tail; i++) {
                arr[i] = arr[i+1];
            }
            tail--;
            return temp;
        }
    }
    
    public void display(){
        if(!isEmpty()){
            System.out.println("There are "+tail+" items in the queue. Displaying...");
            for (int i = 0; i < tail; i++) {
                System.out.println("Data at index "+ i + ": "+arr[i]);
            }
        }
    }
}

public class AppForQueue {
    
    public static void main(String[] args) {
        Queue myQ = new Queue(10);
        myQ.enqueue("Hari");
        myQ.enqueue("anak");
        myQ.enqueue("Selangor");
        myQ.display();
        myQ.dequeue();
        myQ.enqueue("!!!");
        myQ.enqueueMany("dari:Haziq Halifi:dan:rakan-rakan");
        myQ.display();
    }

}