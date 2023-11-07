package Tutorial1;

class Person {

    String name;
    int age;
    static int retireAge = 60;

    String sayHello() {
        return "This is your Captain " + name + " saying Oh-hoyyy!";
    }

    String speak() {
        return "I am " + name + ", " + age + " years old this year mate.";
    }

    String calculateYearsToRetirement() {
        return "I am retiring in " + (retireAge - age) + " years.";
    }

}

public class T1 {

    public static void main(String[] args) {

        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Jack Sparrow";
        person1.age = 38;

        // Create a second Person object using the Person class
        Person person2 = new Person();
        person2.name = "Katy Perry";
        person2.age = 45;

        // Display
        // System.out.println(person1.name);
        // System.out.println(person2.name);
        System.out.println(person1.sayHello());
        System.out.println(person2.sayHello());
        System.out.println(person1.speak());
        System.out.println(person1.calculateYearsToRetirement());
        System.out.println(person2.speak());
        System.out.println(person2.calculateYearsToRetirement());

    }

}
