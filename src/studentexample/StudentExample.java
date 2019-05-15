package studentexample;
public class StudentExample {

    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.setName("Jorge");
        student1.setAge(40);
        student1.setSid(9994);
        
        Student student2 = new Student("Andres",23, 12345);
        
        Student[] studentArray = new Student[2];
        
        studentArray[0] = student1;
        studentArray[1] = student2;
        
        for (Student student:studentArray) {
            System.out.println(student.toString());
        }
    }
    
}
