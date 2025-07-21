package DesignPrinciplesAndPatterns.Observer;

public class ForecastDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("According to the update weather Data, we might get rain today!");
    }
}
