package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

//Gyakorlati feladatok
//        A stringbuilder csomagba dolgozz!
//        Gyakorlati feladat - Törölt járatok
//        Az airport csomagba készítsd el a következő osztályokat:
//        Status enum, ACTIVE és DELETED értékekkel.
//        Flight osztály, melynek van egy String flightNumber és egy Status status attribútuma, továbbá konstruktor, getterek és setterek.
//        Airport osztály, melynek van egy List<Flight> flights attribútuma, valamint egy addFlight(Flight flight) és egy getDeletedFlights() metódusa. Ez utóbbi metódus kigyűjti a listából a törölt státuszú járatokat és visszaadja őket egy ehhez hasonló formában:
//        Törölt járatok:
//        B-2351
//        N-312561
//        S-35
//        Az Airport osztály main() metódusában példányosíts le egy repülőteret és pár repülőjáratot, az utóbbiakat add hozzá a repülőtér listájához, majd ellenőrizd a metódus működését!

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok:");
        for (Flight flight : flights) {
            if (flight.getStatus() == Status.DELETE) {
                sb.append("\n").append(flight.getFlightNumber());

            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.addFlight(new Flight("B-2351", Status.DELETE));
        airport.addFlight(new Flight("A-5621", Status.ACTIVE));
        airport.addFlight(new Flight("N-312561", Status.DELETE));
        airport.addFlight(new Flight("S-35", Status.DELETE));
        airport.addFlight(new Flight("J-789", Status.ACTIVE));

        System.out.println(airport.getDeletedFlights());
    }
}
