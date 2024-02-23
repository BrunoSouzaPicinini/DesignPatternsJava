package facade;

public class TheaterLights {

    public void on() {
        System.out.println("TheaterLights is on");
    }

    public void off() {
        System.out.println("TheaterLights is off");
    }

    public void dim(int i) {
        System.out.println("TheaterLights is dimming to " + i + "%");
    }
}
