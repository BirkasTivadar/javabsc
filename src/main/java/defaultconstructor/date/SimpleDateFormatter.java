package defaultconstructor.date;

public class SimpleDateFormatter {

    private CountryCode countryCode;

    public SimpleDateFormatter() {
        this.countryCode = CountryCode.HU;
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        return switch (countryCode) {
            case EN -> String.format("%d-%d-%d", simpleDate.getDay(), simpleDate.getMonth(), simpleDate.getYear());
            case US -> String.format("%d-%d-%d", simpleDate.getMonth(), simpleDate.getDay(), simpleDate.getYear());
            default -> String.format("%d-%d-%d", simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay());
        };
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(countryCode, simpleDate);
    }
}
