package command.receiver;

import java.util.Map;

public class CeilingFan extends Location {

    private static final int HIGHER = 3;
    private static final int OFF = 0;
    private Map<Integer, String> speedMap = Map.of(0, "OFF", 1, "LOW", 2, "MEDIUM", 3, "HIGH");
    private int speed;
    public CeilingFan(String locationName) {
        super(locationName);
        speed = OFF;
    }

    public void on() {
        System.out.println((locationName + " ceiling fan is on").trim());
    }

    public void off() {
        System.out.println((locationName + " ceiling fan is off").trim());
    }

    public void increase() {
        if(speed == HIGHER) {
            System.out.println((locationName + " ceiling fan is already on high").trim());
            return;
        }
        speed++;
        System.out.println((locationName + " ceiling fan is " + speedMap.get(speed)).trim());
    }

    public void decrease() {
        if(speed == OFF) {
            System.out.println((locationName + " ceiling fan is already off").trim());
            return;
        }
        speed--;
        System.out.println((locationName + " ceiling fan is " + speedMap.get(speed)).trim());
    }

}
