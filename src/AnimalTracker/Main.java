package AnimalTracker;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird; // Assigned `bird` to an `Animal` reference
        FlightEnabled flier = bird; // " to a `FlightEnabled` reference
        Trackable tracked = bird; // " to a `Trackable` reference

        animal.move();
        //  flier.move();
        //  tracked.move();
//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

    }

    // `inFlight` method will take a `FlightEnabled` `bird` reference
    private static void inFlight (FlightEnabled flier) {
        flier.takeOff(); // Method specific to `flier`
        flier.fly(); // "

        // Checks if this `FlightEnabled` `bird` reference is
        // also an instance of `Trackable`
        if (flier instanceof Trackable tracked) {
            tracked.track(); // If yes, track `bird`
        }

        flier.land();
    }
}
