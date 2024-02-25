package facade;

public class Main {
    public static void main(String[] args) {
        var homeTheaterFacade = new HomeTheaterFacade(
                new Amplifier(),            
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper()
        );
        homeTheaterFacade.start();

        System.out.println("\n\n");
        System.out.println("Movie is over");
        System.out.println("\n\n");

        homeTheaterFacade.end();
    }
}
