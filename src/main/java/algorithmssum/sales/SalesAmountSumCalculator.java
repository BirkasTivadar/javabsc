package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {
    public int sumSalesAmount(List<Salesperson> salespersons) {
        return salespersons.stream().mapToInt(Salesperson::getAmount).sum();
    }
}
