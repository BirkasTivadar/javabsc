package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("John", 600, 500),
            new Salesperson("Bill", 200, 300),
            new Salesperson("Kate", 700, 100),
            new Salesperson("Mary", 700, 300),
            new Salesperson("Karl", 200, 50)
    );

    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {
        Sales maxAmount = new Sales();

        assertEquals(700, maxAmount.selectSalesPersonWithMaxSalesAmount(salespersons).amount());
        assertEquals(100, maxAmount.selectSalesPersonWithMaxSalesAmount(salespersons).target());
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {
        Sales aboveTarget = new Sales();

        assertEquals(600, aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).getDifferenceFromTarget());
        assertEquals(700, aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).amount());
        assertEquals(100, aboveTarget.selectSalesPersonWithFurthestAboveTarget(salespersons).target());
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget() {
        Sales belowTarget = new Sales();

        assertEquals(-100, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getDifferenceFromTarget());
        assertEquals(200, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).amount());
        assertEquals(300, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).target());
    }
}