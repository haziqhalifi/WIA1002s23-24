// Need to revise again
package Lab1;

public class Course {
    private String courseName;
    private String[] students;
    private int numOfStudent;

    public Course(String courseName) {
        this.courseName = courseName;
        numOfStudent = 0;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public void addStudent(String student){
        String[] temp = students;
        students = new String[numOfStudent];
        for (int i = 0; i < numOfStudent-1; i++) {
            students[i] = temp[i];
        }
    }
    
    public void dropStudent(){
        numOfStudent--;
        String[] temp
    }
}
