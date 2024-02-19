package command.receiver;

public class Stereo extends Location {

    public Stereo(String locationName) {
        super(locationName);
    }

    public void on() {
        System.out.println((locationName + " Stereo is on").trim());
    }

    public void setCD() {
        System.out.println((locationName + " Stereo is set for CD input").trim());
    }

    public void setVolume(int volume) {
        System.out.println((locationName + " Stereo volume set to " + volume).trim());
    }

    public void off() {
        System.out.println(locationName + " Stereo is off");
    }
}
