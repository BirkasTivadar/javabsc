package introexceptioncause;

import java.util.List;

public class Tracking {

    public static void main(String[] args) {

        TrackPoints trackPoints = new TrackPoints();
        List<String> gpsList;

        try {
            gpsList = trackPoints.readGPS();
            trackPoints.printDifferentsOfAltitude(gpsList);
        } catch (IllegalStateException ise) {
            ise.getCause().printStackTrace();
        }
    }
}
