package Tutorial1;

class Frog {

    void speak(String str) {
        System.out.println(str);
    }

    void jump(int num) {
        for (int i = 1; i < 4; i++) {
            System.out.println("Jumping " + num + "cm " + i + " time!");
        }
    }
    
    void move(String str, double num){
        System.out.println("Moving "+num+" meters in the "+str+" direction");
    }
    
}

public class Tutorial2 {

    public static void main(String[] args) {

        Frog sam = new Frog();

        sam.speak("Hi, I am Sam");
        sam.jump(7);
        sam.move("West", 5.5);

        String greeting = "Good morning!";
        sam.speak(greeting);

    }
}
