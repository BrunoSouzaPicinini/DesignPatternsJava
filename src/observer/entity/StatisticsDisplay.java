package observer.entity;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StatisticsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        var forecast = """
                ---------------------------------
                Weather Statistics AT %s
                t:%f h:%f p:%f
                ---------------------------------
                """.formatted(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME), temperature, humidity, pressure);

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
