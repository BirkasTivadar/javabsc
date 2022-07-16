/*
PublicTransport osztály, amelynek legyen egy List<PublicVehicle> típusú attribútuma, a hozzátartozó getter metódussal és egy addVehicle(PublicVehicle vehicle) metódussal, amellyel új járművet adhatunk a listához.
*/

package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {
    private final List<PublicVehicle> publicVehicles = new ArrayList<>();

    public void addVehicle(PublicVehicle vehicle) {
        publicVehicles.add(vehicle);
    }

    public List<PublicVehicle> getPublicVehicles() {
        return new ArrayList<>(publicVehicles);
    }
}
