package Tutorial2;

class Student {

    private String name;
    private int matricId;
    private int year;

    public Student() {
        this.name = "No name";
        this.matricId = 9999;
        this.year = 1;
    }

    public Student(String name) {
        this.name = name;
        this.matricId = 9999;
        this.year = 1;
    }

    public Student(String name, int matricId) {
        this.name = name;
        this.matricId = matricId;
        this.year = 1;
    }

    public Student(String name, int matricId, int year) {
        this.name = name;
        this.matricId = matricId;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMatricId() {
        return matricId;
    }

    public void setMatricId(int matricId) {
        this.matricId = matricId;
    }

    public void showInfo() {
        System.out.println(name + "\t" + matricId + "\t\t" + year); 
    }
}

public class Register {

    public static void main(String[] args) {
        Student alexaObj = new Student("Alexa", 1007, 2);
//        alexaObj.setName("Alexa");
//        alexaObj.setMatricId(5018);

        Student siriObj = new Student("Siri", 5018, 4);
//        siriObj.setName("Siri");
//        siriObj.setMatricId(5018);

        Student omegaObj = new Student("Omega", 2019, 1);
//        omegaObj.setName("Omega");
//        omegaObj.setMatricId(2019);

        Student betaObj = new Student("Beta", 2371, 3);
//        betaObj.setName("Beta");
//        betaObj.setMatricId(2371);

        Student thanosObj = new Student("Thanos");
        Student ironObj = new Student("Ironman", 2012);
        Student noNameObj =  new Student();

        System.out.println("Name\tMatric Id\tYear");
        siriObj.setName("Sirius");
        alexaObj.showInfo();
        siriObj.showInfo();
        omegaObj.showInfo();
        betaObj.showInfo();
        thanosObj.showInfo();
        ironObj.showInfo();
        noNameObj.showInfo();

    }

}
