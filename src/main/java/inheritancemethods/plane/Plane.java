/*
Végül hozz létre egy Plane osztályt, amelynek main() metódusában példányosíts egy Passenger-t, egy PriorityPassenger-t és egy FirstClassPassenger-t, majd írd ki a konzolra az attribútumaik értékét!
*/

package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("tourist", 56_000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("business", 80_000, 15);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("first class", 120_000, 20);

        System.out.println(passenger);
        System.out.println(priorityPassenger);
        System.out.println(firstClassPassenger);
    }
}

