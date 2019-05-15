package studentexample;
public class StudentExample {

    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.setName("Jorge");
        student1.setAge(40);
        student1.setSid(9994);
        
        Student student2 = new Student("Paola",41, 12345);
        Student student3 = new Student("Juanita",3,9991);
        Student student4 = new Student("Martin",6,7834);
        Student student5 = new Student("Andrea",41,65434);
        
        Student[] studentArray = new Student[5];
        
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;
        studentArray[3] = student4;
        studentArray[4] = student5;
        
        for (Student student:studentArray) {
            System.out.println(student.toString());
        }
    }    
}
