package DesignPrinciplesAndPatterns.Observer;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(30.5f, 50.6f , 90.2f);

        ForecastDisplay forecastDisplay = new ForecastDisplay();
        AverageStatsDisplay averageStatsDisplay = new AverageStatsDisplay();
        CurrentStatsDisplay currentStatsDisplay = new CurrentStatsDisplay();

        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(averageStatsDisplay);
        weatherData.registerObserver(currentStatsDisplay);

        weatherData.setMeasurements(30.5f, 50.6f , 90.2f);

        weatherData.removeObserver(averageStatsDisplay);

        weatherData.setMeasurements(30.5f, 50.6f , 90.2f);

        averageStatsDisplay.setSubject(weatherData);
        averageStatsDisplay.registerWithSubject();

        weatherData.setMeasurements(30.5f, 50.6f , 90.2f);


    }
}
