package DesignPrinciplesAndPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(int gradYear, int id, String name, double psp, int iq) {
        super(gradYear, id, name, psp);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}
