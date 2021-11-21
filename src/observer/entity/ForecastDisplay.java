package observer.entity;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ForecastDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        var forecast = """
                ---------------------------------
                FORECAST AT NOW %s
                the temperature is %.2f
                the humidity is %.2f
                the pressure is %.2f
                ---------------------------------
                """.formatted(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), temperature, humidity, pressure);

        System.out.println(forecast);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
