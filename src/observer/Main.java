package observer;

import observer.entity.ForecastDisplay;
import observer.entity.StatisticsDisplay;
import observer.entity.WeatherData;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay();
        weatherData.registerObserver(forecastDisplay);
        weatherData.setMeasurements(24, 38, 1012);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        weatherData.registerObserver(statisticsDisplay);

        Thread.sleep(2000);
        weatherData.setMeasurements(29, 30, 1020);

        weatherData.removeObserver(forecastDisplay);

        Thread.sleep(2000);
        weatherData.setMeasurements(25, 34, 1018);

    }
}
