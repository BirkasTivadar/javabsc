/*
Végül hozz létre egy BuildingMain osztályt, amelynek main() metódusában példányosíts egy Building és egy SchoolBuilding példányt is! Írd ki a konzolra az attribútumaik értékét!
*/

package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {

        Building building = new Building("Tower", 234.56, 4);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        SchoolBuilding schoolBuilding = new SchoolBuilding("Instituto Sol", 56.23, 2, 10);
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
