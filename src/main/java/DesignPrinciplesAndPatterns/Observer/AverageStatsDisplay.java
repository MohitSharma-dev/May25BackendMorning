package DesignPrinciplesAndPatterns.Observer;

public class AverageStatsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void registerWithSubject(){
        subject.registerObserver(this);
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Average data : " + temperature + "\t" + humidity + "\t" + pressure);
    }
}
