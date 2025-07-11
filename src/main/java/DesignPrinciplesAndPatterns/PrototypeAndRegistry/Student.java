package DesignPrinciplesAndPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private double psp;
    private int gradYear;
    private String course;
    private int lengthCourse;
    private int amountPaid;


    public Student(int gradYear, int id, String name, double psp) {
        this.gradYear = gradYear;
        this.id = id;
        this.name = name;
        this.psp = psp;
    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.psp = student.psp;
        this.gradYear = student.gradYear;
        this.course = student.course;
        this.lengthCourse = student.lengthCourse;
        this.amountPaid = student.amountPaid;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLengthCourse() {
        return lengthCourse;
    }

    public void setLengthCourse(int lengthCourse) {
        this.lengthCourse = lengthCourse;
    }

    // control the flow of copying
    public Student copy(){
        return new Student(this);
    }
}
