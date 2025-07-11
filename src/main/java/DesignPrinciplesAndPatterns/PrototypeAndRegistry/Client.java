package DesignPrinciplesAndPatterns.PrototypeAndRegistry;

public class Client {

    public static void main(String[] args) {
        Student st = new Student(2020, 1 , "Rahul", 90.0);
        IntelligentStudent is = new IntelligentStudent(2020, 1 , "Intelligent Rahul", 90.0, 50);

        // create the copy of both the objects
        Student stCopy = new Student(st);
        IntelligentStudent isCopy = new IntelligentStudent(is);

        Student st1 = st.copy();
        System.out.println(st1.getName());
        st1 = is.copy();
        System.out.println(st1.getName());

        StudentUtility.createCopy(st);
        StudentUtility.createCopy(is);


//
        Student dataScienceStudent = new Student(2020, 1 , "Rahul", 90.0);
        dataScienceStudent.setCourse("Data Science");
        dataScienceStudent.setAmountPaid(500);
        dataScienceStudent.setLengthCourse(12);

        Student devopsStudent = new Student(2020, 1 , "Rahul", 90.0);
        devopsStudent.setCourse("Devops");
        devopsStudent.setAmountPaid(200);
        devopsStudent.setLengthCourse(9);

        Student softwareStudent = new Student(2020, 1 , "Rahul", 90.0);
        softwareStudent.setCourse("Software");
        softwareStudent.setAmountPaid(600);
        softwareStudent.setLengthCourse(18);

        StudentRegistry studentRegistry = new StudentRegistry();
        Student student5 = studentRegistry.get(StudentType.DEVOPS);
        Student student6 = studentRegistry.get(StudentType.SOFTWARE);
    }
}
