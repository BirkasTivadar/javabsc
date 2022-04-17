package algorithmsmax.sales;

/*
Feladat a következő metódusok megírása a Sales osztályban:

        selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) : kiválasztja a legnagyobb árbevételt elért értékesítőt
        selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) : kiválasztja azt az értékesítőt, aki a célt a legnagyobb összeggel meghaladta
        selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) : kiválasztja azt az értékesítőt, aki a legnagyobb összeggel alulmúlta a célt
*/

import java.util.Comparator;
import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        return salespersons.stream().max(Comparator.comparingInt(Salesperson::amount)).get();
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        return salespersons.stream().max(Comparator.comparingInt(Salesperson::getDifferenceFromTarget)).get();
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        return salespersons.stream().min(Comparator.comparingInt(Salesperson::getDifferenceFromTarget)).get();
    }
}
