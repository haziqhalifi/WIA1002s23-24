package Tutorial1;
class Person {

        String name;
        int age;
    }

public class Tutorial1 {

    

    public static void main(String[] args) {

        // Create an object for class Person 
        Person person1 = new Person();
        person1.name = "Jack Sparrow";
        person1.age = 38;

        // Create a second object for class Person 
        Person person2 = new Person();
        person2.name = "Katy Perry";
        person2.age = 45;

        // Display
        System.out.println(person1.name);
        System.out.println(person2.age);

    }
}
