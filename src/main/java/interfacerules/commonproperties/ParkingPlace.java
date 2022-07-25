/*
Végül készíts egy ParkingPlace osztályt, amelynek nincs attribútuma, viszont implementálja a Length és a Width interfészeket. Mivel egy használható parkolóhely legkisebb szabványos mérete 2,2 méter x 5 méter, ezért a megvalósított metódusok ezeket az értékeket adják vissza!
*/

package interfacerules.commonproperties;

public class ParkingPlace implements Length ,Width{

    @Override
    public double getLength() {
        return 5;
    }

    @Override
    public double getWidth() {
        return 2.2;
    }
}
